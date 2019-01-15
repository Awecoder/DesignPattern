package top.dtyy.pattern.principle.openclose;

/**
 * @author lzp
 * @version v1.0 at 2018/12/9
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(12, "并发编程", 100d);
        System.out.println("课程ID:" + iCourse.getId());
        System.out.println("课程名称:" + iCourse.getName());
        System.out.println("课程原价:" + iCourse.getPrice());
        System.out.println("课程折后价格:" + ((JavaDiscountCourse) iCourse).getDiscountPrice());
    }
}
