package top.dtyy.pattern.structural.flyweight;

/**
 * @author lzp
 * @version v1.0 at 2019/1/1
 */
public class Manager implements IEmployee {
    // 职位 -- 内部状态
    private String title = "部门经理";
    // 部门 -- 外部状态
    private String department;
    // 报告内容
    private String reportContent;

    // 有参构造方法
    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
