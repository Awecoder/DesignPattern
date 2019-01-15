package top.dtyy.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式工厂
 *
 * @author lzp
 * @version v1.0 at 2019/1/1
 */
public class FlyweightFactory {
    // 容器单例
    private static final Map<String, IEmployee> EMPLOYEE_MAP = new HashMap<>();

    // 获取经理对象
    public static IEmployee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        // 如果部门经理为空，创建部门经理
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理：" + department);
            String reportContent = department + "部门汇报: 内容是......";
            manager.setReportContent(reportContent);
            System.out.println("  创建报告：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
