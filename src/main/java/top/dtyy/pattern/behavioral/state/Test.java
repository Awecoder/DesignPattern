package top.dtyy.pattern.behavioral.state;

/**
 * @author lzp
 * @version v1.0 at 2019/4/16
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.execute(context);
        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.execute(context);
        System.out.println(context.getState().toString());
    }
}
