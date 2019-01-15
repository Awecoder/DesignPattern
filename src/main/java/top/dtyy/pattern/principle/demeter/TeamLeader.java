package top.dtyy.pattern.principle.demeter;

import java.util.List;

/**
 * @author lzp
 * @version v1.0 at 2018/12/11
 */
public class TeamLeader {
    //    public void checkNumberOfCourses() {
//        List<Course> courseList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            courseList.add(new Course());
//        }
//        System.out.println("在线课程的数量是：" + courseList.size());
//    }
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
