package top.dtyy.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理处理器
 *
 * @author lzp
 * @version v1.0 at 2019/4/9
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object target; // 目标对象

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始事务"); // before
        Object ret = method.invoke(target, args); // 执行目标对象方法
        System.out.println("结束事务"); // after
        return ret;
    }
}
