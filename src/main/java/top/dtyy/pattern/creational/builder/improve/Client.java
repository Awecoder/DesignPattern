package top.dtyy.pattern.creational.builder.improve;


/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder()
                .buildProductName("建造者模式")
                .buildProductVideo("模式Video")
                .buildProductArticle("模式手记")
                .build();
        System.out.println(product);

    }
}
