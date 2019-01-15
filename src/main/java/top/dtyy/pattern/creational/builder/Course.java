package top.dtyy.pattern.creational.builder;

/**
 * 课程产品类
 *
 * @author lzp
 * @version v1.0 at 2018/12/24
 */
public class Course {
    private String courseName;
    private String courseVideo;
    private String courseArticle;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                '}';
    }
}
