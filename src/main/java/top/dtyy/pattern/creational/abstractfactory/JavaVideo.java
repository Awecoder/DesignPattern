package top.dtyy.pattern.creational.abstractfactory;

/**
 * @author lzp
 * @version v1.0 at 2018/12/18
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
