package top.dtyy.pattern.principle.dependenceinversion;

/**
 * @author lzp
 * @version v1.0 at 2018/12/10
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Ming在学习Java课程");
    }
}
