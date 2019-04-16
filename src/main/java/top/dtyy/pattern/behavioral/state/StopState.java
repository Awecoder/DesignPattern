package top.dtyy.pattern.behavioral.state;

/**
 * @author lzp
 * @version v1.0 at 2019/4/16
 * @description: 停止状态
 */
public class StopState implements State {
    @Override
    public void execute(Context context) {
        System.out.println("电脑处于停止状态");
        context.setState(this);
    }

    public String toString() {
        return "停止状态";
    }
}
