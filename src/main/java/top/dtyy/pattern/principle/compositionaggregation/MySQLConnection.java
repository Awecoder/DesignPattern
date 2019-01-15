package top.dtyy.pattern.principle.compositionaggregation;

/**
 * @author lzp
 * @version v1.0 at 2018/12/14
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
