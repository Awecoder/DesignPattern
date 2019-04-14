package top.dtyy.pattern.behavioral.templatemethod;

/**
 * @author lzp
 * @version v1.0 at 2019/4/11
 * @description: 父类公共部分
 */
public abstract class FlashContext {
    // 流程名称
    private String name;

    public FlashContext(String name) {
        this.name = name;
    }

    // 闪电贷查询处理流程
    public void process() {
        System.out.println(this.name + "：判断系统维护状态、客户是否免打扰、客户在途或被拒流程...");
        processCrl();
    }

    // 抽象方法供子类实现
    public abstract void processCrl();
}
