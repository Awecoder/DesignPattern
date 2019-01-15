package top.dtyy.pattern.principle.compositionaggregation;

/**
 * @author lzp
 * @version v1.0 at 2018/12/14
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
