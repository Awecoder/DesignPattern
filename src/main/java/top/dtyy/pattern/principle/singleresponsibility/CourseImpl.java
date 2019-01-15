package top.dtyy.pattern.principle.singleresponsibility;

/**
 * @author lzp
 * @version v1.0 at 2018/12/10
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
