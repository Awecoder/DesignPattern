package top.dtyy.pattern.structural.adapter.classadapter;

/**
 * 客户端测试类
 *
 * @author lzp
 * @version v1.0 at 2019/1/1
 */
public class Client {
    public static void main(String[] args) {
        ITartet tartet = new Adapter();
        tartet.method();
    }
}
