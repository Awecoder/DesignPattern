package top.dtyy.pattern.behavioral.state;

/**
 * @author lzp
 * @version v1.0 at 2019/4/16
 * @description: 环境上下文
 */
public class Context {
    private State state; // 当前状态

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
