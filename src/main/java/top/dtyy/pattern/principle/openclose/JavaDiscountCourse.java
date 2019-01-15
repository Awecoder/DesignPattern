package top.dtyy.pattern.principle.openclose;

/**
 * @author lzp
 * @version v1.0 at 2018/12/9
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
