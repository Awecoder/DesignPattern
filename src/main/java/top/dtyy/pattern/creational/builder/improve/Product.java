package top.dtyy.pattern.creational.builder.improve;

/**
 * @author lzp
 * @version v1.0 at 2018/12/24
 */
public class Product {
    private String productName;
    private String productVideo;
    private String productArticle;

    public Product(ProductBuilder productBuilder) {
        this.productName = productBuilder.productName;
        this.productVideo = productBuilder.productVideo;
        this.productArticle = productBuilder.productArticle;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productVideo='" + productVideo + '\'' +
                ", productArticle='" + productArticle + '\'' +
                '}';
    }

    public static class ProductBuilder {
        private String productName;
        private String productVideo;
        private String productArticle;

        public ProductBuilder buildProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public ProductBuilder buildProductVideo(String productVideo) {
            this.productVideo = productVideo;
            return this;
        }

        public ProductBuilder buildProductArticle(String productArticle) {
            this.productArticle = productArticle;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
