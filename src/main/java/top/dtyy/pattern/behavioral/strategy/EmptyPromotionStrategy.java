package top.dtyy.pattern.behavioral.strategy;

/**
 * @author lzp
 * @version v1.0 at 2019/4/12
 * @description: 无促销策略
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
