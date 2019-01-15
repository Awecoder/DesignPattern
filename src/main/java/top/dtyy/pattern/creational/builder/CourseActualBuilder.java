package top.dtyy.pattern.creational.builder;

/**
 * @author lzp
 * @version v1.0 at 2018/12/24
 */
public class CourseActualBuilder extends CourseBuilder {
    /**
     * 产品对象
     */
    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
