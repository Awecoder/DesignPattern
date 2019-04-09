package top.dtyy.pattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * 客户端测试类
 *
 * @author lzp
 * @version v1.0 at 2019/4/9
 */
public class Test {
    public static void main(String[] args) {
        // 1 静态代理测试
        Interface target = new RealObject();
        StaticProxy staticProxy = new StaticProxy(target);
        staticProxy.doSomething();

        System.out.println();

        // 2 JDK动态代理
        Interface dynamicProxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(target));
        dynamicProxy.doSomething();

        System.out.println();

        // 3 CGLib动态代理
        RealObject cglibTarget = (RealObject) new CGLibProxy(target).getProxyInstance();
        cglibTarget.doSomething();
    }
}
