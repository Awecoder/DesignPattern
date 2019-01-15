package top.dtyy.pattern.creational.abstractfactory;

/**
 * @author lzp
 * @version v1.0 at 2018/12/18
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
