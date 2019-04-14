package top.dtyy.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzp
 * @version v1.0 at 2019/4/12
 * @description: 促销策略工厂
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();
    private PromotionStrategyFactory() {
    }

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
    }
}
