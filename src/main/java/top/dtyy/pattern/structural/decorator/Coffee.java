package top.dtyy.pattern.structural.decorator;

/**
 * @author lzp
 * @version v1.0 at 2018/12/28
 */
public class Coffee extends AbstractCoffee {
    @Override
    protected String getDesc() {
        return "黑咖啡";
    }

    @Override
    protected int cost() {
        return 10;
    }
}
