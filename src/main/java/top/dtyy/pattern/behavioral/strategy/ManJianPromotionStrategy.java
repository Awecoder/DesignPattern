package top.dtyy.pattern.behavioral.strategy;

/**
 * @author lzp
 * @version v1.0 at 2019/4/12
 * @description: 满减促销策略
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满50减5元");
    }
}
