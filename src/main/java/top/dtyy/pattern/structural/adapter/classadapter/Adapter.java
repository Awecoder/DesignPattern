package top.dtyy.pattern.structural.adapter.classadapter;

/**
 * 适配者类
 *
 * @author lzp
 * @version v1.0 at 2019/1/1
 */
public class Adapter extends Adaptee implements ITartet {
    @Override
    public void method() {
        // 其它操作
        super.adapteeMethod();
        // 其它操作
    }
}
