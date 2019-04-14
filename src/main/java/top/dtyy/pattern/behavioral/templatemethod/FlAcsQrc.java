package top.dtyy.pattern.behavioral.templatemethod;

/**
 * @author lzp
 * @version v1.0 at 2019/4/11
 * @description: 普通闪电贷查询子类
 */
public class FlAcsQrc extends FlashContext {
    public FlAcsQrc() {
        super("普通闪电贷查询");
    }

    @Override
    public void processCrl() {
        System.out.println("处理主机额度或预授信额度");
    }
}
