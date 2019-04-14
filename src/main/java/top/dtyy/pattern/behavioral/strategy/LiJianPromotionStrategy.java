package top.dtyy.pattern.behavioral.strategy;

/**
 * @author lzp
 * @version v1.0 at 2019/4/12
 * @description: 立减促销策略
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("购买立减5元");
    }
}
