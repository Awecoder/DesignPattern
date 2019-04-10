package top.dtyy.pattern.structural.composite;

/**
 * 抽象文件构件--Component
 *
 * @author lzp
 * @version v1.0 at 2019/4/10
 */
public abstract class AbstractFile {
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(AbstractFile file) {
        throw new UnsupportedOperationException("不支持获取文件名");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
