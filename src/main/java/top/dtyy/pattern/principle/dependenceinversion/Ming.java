package top.dtyy.pattern.principle.dependenceinversion;

/**
 * @author lzp
 * @version v1.0 at 2018/12/9
 */
public class Ming {
    private ICourse iCourse;

    public void studyCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
