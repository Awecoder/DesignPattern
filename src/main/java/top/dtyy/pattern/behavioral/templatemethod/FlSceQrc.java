package top.dtyy.pattern.behavioral.templatemethod;

/**
 * @author lzp
 * @version v1.0 at 2019/4/11
 * @description: 场景闪电贷子类
 */
public class FlSceQrc extends FlashContext {
    public FlSceQrc() {
        super("场景闪电贷查询");
    }

    @Override
    public void processCrl() {
        System.out.println("场景子额度筛选与处理");
    }
}
