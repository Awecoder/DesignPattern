package top.dtyy.pattern.structural.proxy;

/**
 * 静态代理类
 *
 * @author lzp
 * @version v1.0 at 2019/4/9
 */
public class StaticProxy implements Interface {
    private Interface target; // 目标对象

    public StaticProxy(Interface target) {
        this.target = target;
    }

    @Override
    public void doSomething() {
        System.out.println("开始事务");
        target.doSomething();
        System.out.println("结束事务");
    }
}
