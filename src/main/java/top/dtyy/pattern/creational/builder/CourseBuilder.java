package top.dtyy.pattern.creational.builder;

/**
 * 建造者抽象类
 *
 * @author lzp
 * @version v1.0 at 2018/12/24
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);

    public abstract Course makeCourse();
}
