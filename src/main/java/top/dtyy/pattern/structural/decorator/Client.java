package top.dtyy.pattern.structural.decorator;

/**
 * @author lzp
 * @version v1.0 at 2018/12/28
 */
public class Client {
    public static void main(String[] args) {
        AbstractCoffee coffee;
        coffee = new Coffee();
        coffee = new MilkDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDesc() + " 价格：" + coffee.cost() + "元");
    }
}
