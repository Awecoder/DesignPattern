package top.dtyy.pattern.creational.builder;

/**
 * @author lzp
 * @version v1.0 at 2018/12/24
 */
public class Client {
    public static void main(String[] args) {
        // 建造者
        CourseBuilder builder = new CourseActualBuilder();
        // 指导者
        Director director = new Director();
        director.setCourseBuilder(builder);
        // 创建课程产品
        Course course = director.makeCourse("建造者模式", "模式video", "模式手记");
        System.out.println(course);


    }
}
