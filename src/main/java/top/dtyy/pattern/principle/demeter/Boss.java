package top.dtyy.pattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version v1.0 at 2018/12/11
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }
}
