package top.dtyy.pattern.behavioral.strategy;

/**
 * @author lzp
 * @version v1.0 at 2019/4/12
 * @description: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        String promotionKey = "LIJIAN"; // 外部传入
        PromotionActivity activity = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        activity.executePromotionStrategy();
        activity.setPromotionStrategy(
                PromotionStrategyFactory.getPromotionStrategy("MANJIAN"));
        activity.executePromotionStrategy();
    }
}
