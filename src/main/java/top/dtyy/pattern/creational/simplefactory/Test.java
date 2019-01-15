package top.dtyy.pattern.creational.simplefactory;

/**
 * 应用层
 *
 * @author lzp
 * @version v1.0 at 2018/12/15
 */
public class Test {
    public static void main(String[] args) {
//        // 1
//        Video video = new JavaVideo();
//        video.produce();
        // 2
//        Video video = new VideoFactory().getVideo("Java");
//        video.produce();
        VideoFactory vf = new VideoFactory();
        Video video = vf.getVideo(JavaVideo.class);
        if (video != null) {
            video.produce();
        }

    }
}
