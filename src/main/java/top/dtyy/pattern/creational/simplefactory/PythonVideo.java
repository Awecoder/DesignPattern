package top.dtyy.pattern.creational.simplefactory;

/**
 * @author lzp
 * @version v1.0 at 2018/12/15
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
