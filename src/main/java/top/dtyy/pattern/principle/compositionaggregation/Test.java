package top.dtyy.pattern.principle.compositionaggregation;

/**
 * @author lzp
 * @version v1.0 at 2018/12/14
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
    }
}
