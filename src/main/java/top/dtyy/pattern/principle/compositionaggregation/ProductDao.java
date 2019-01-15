package top.dtyy.pattern.principle.compositionaggregation;

/**
 * @author lzp
 * @version v1.0 at 2018/12/14
 */
public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "执行新增产品这一DAO层操作");
    }
}
