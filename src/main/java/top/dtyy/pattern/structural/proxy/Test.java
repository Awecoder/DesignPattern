package top.dtyy.pattern.structural.proxy;

/**
 * 客户端测试类
 *
 * @author lzp
 * @version v1.0 at 2019/4/9
 */
public class Test {
    public static void main(String[] args) {
        Interface target = new RealObject();
        StaticProxy proxy = new StaticProxy(target);
        proxy.doSomething();
    }
}
