package top.dtyy.pattern.creational.factorymethod;

/**
 * 应用层
 *
 * @author lzp
 * @version v1.0 at 2018/12/15
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory vf = new JavaVideoFactory();
        Video video = vf.getVideo();
        video.produce();
    }
}
