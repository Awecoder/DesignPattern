package top.dtyy.pattern.creational.abstractfactory;

/**
 * @author lzp
 * @version v1.0 at 2018/12/18
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("写Python手记");
    }
}
