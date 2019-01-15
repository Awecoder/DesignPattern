package top.dtyy.pattern.structural.flyweight;

/**
 * @author lzp
 * @version v1.0 at 2019/1/1
 */
public class Client {
    private static final String[] departments = {"软件开发", "测试开发", "产品经理"};

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) FlyweightFactory.getManager(department);
            manager.report();
        }
    }
}
