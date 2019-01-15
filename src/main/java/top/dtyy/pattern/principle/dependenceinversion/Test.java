package top.dtyy.pattern.principle.dependenceinversion;

/**
 * @author lzp
 * @version v1.0 at 2018/12/10
 */
public class Test {
    public static void main(String[] args) {
        Ming ming = new Ming();
        ming.setiCourse(new FECourse());
        ming.studyCourse();
        ming.setiCourse(new JavaCourse());
        ming.studyCourse();
    }
}
