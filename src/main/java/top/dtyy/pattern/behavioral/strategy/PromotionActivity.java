package top.dtyy.pattern.behavioral.strategy;

/**
 * @author lzp
 * @version v1.0 at 2019/4/12
 * @description: 促销活动类
 */
public class PromotionActivity {
    // 促销策略
    private PromotionStrategy strategy;

    public PromotionActivity(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    // 执行促销策略
    public void executePromotionStrategy() {
        System.out.println("当前产品大促销：");
        strategy.doPromotion();
    }

    // 运行时设置促销策略
    public void setPromotionStrategy(PromotionStrategy strategy) {
        this.strategy = strategy;
    }
}
