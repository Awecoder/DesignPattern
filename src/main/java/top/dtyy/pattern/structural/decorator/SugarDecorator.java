package top.dtyy.pattern.structural.decorator;

/**
 * @author lzp
 * @version v1.0 at 2018/12/28
 */
public class SugarDecorator extends AbstractDecorator {
    public SugarDecorator(AbstractCoffee abstractCoffee) {
        super(abstractCoffee);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + ",加糖";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
