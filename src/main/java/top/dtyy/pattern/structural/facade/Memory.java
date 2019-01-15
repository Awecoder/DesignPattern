package top.dtyy.pattern.structural.facade;

/**
 * @author lzp
 * @version v1.0 at 2018/12/27
 */
public class Memory implements IDevice {
    @Override
    public void startUp() {
        System.out.println("启动内存");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭内存");
    }
}
