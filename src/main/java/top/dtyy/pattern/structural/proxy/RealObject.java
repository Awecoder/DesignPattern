package top.dtyy.pattern.structural.proxy;

/**
 * 接口实现类 -- 目标对象
 *
 * @author lzp
 * @version v1.0 at 2019/4/9
 */
public class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("保存数据");
    }
}
