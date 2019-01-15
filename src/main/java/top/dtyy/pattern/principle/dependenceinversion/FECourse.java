package top.dtyy.pattern.principle.dependenceinversion;

/**
 * @author lzp
 * @version v1.0 at 2018/12/10
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Ming在学习前端课程");
    }
}
