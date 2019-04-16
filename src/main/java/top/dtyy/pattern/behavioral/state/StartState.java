package top.dtyy.pattern.behavioral.state;

/**
 * @author lzp
 * @version v1.0 at 2019/4/16
 * @description: 开始状态
 */
public class StartState implements State {
    @Override
    public void execute(Context context) {
        System.out.println("电脑当前处于启动状态");
        context.setState(this);
    }

    public String toString() {
        return "启动状态";
    }
}
