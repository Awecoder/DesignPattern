package top.dtyy.pattern.structural.decorator;

/**
 * @author lzp
 * @version v1.0 at 2018/12/28
 */
public class AbstractDecorator extends AbstractCoffee {
    private AbstractCoffee abstractCoffee;

    public AbstractDecorator(AbstractCoffee abstractCoffee) {
        this.abstractCoffee = abstractCoffee;
    }

    @Override
    protected String getDesc() {
        return abstractCoffee.getDesc();
    }

    @Override
    protected int cost() {
        return abstractCoffee.cost();
    }
}
