package top.dtyy.pattern.structural.decorator;

/**
 * @author lzp
 * @version v1.0 at 2018/12/28
 */
public class MilkDecorator extends AbstractDecorator {
    public MilkDecorator(AbstractCoffee abstractCoffee) {
        super(abstractCoffee);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + ",加牛奶";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
