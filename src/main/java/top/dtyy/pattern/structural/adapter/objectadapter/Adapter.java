package top.dtyy.pattern.structural.adapter.objectadapter;

/**
 * 适配器
 *
 * @author lzp
 * @version v1.0 at 2019/1/1
 */
public class Adapter implements ITartet {
    // 组合的方式
    private Adaptee adaptee = new Adaptee();

    @Override
    public void method() {
        // 其它操作
        adaptee.adapteeMethod();
        // 其它操作
    }
}
