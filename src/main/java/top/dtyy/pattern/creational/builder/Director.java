package top.dtyy.pattern.creational.builder;

/**
 * @author lzp
 * @version v1.0 at 2018/12/24
 */
public class Director {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String courseVideo, String courseArticle) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        return this.courseBuilder.makeCourse();
    }
}
