package top.dtyy.pattern.structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib动态代理类
 *
 * @author lzp
 * @version v1.0 at 2019/4/9
 */
public class CGLibProxy implements MethodInterceptor {
    private Object target; // 目标对象

    public CGLibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务"); // before
        Object ret = method.invoke(target, objects); // 执行目标对象方法
        System.out.println("结束事务"); // after
        return ret;
    }

    public Object getProxyInstance() {
        // 工具类
        Enhancer en = new Enhancer();
        // 设置父类
        en.setSuperclass(target.getClass());
        // 设置回调
        en.setCallback(this);
        // 创建子类
        return en.create();
    }
}
