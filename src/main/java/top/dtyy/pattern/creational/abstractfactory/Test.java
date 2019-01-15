package top.dtyy.pattern.creational.abstractfactory;

/**
 * @author lzp
 * @version v1.0 at 2018/12/18
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Video javaVideo = factory.getVideo();
        Article javaArticle = factory.getArticle();
        javaArticle.produce();
        javaVideo.produce();
    }
}
