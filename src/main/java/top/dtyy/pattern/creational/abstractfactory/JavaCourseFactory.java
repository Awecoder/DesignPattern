package top.dtyy.pattern.creational.abstractfactory;

/**
 * @author lzp
 * @version v1.0 at 2018/12/18
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
