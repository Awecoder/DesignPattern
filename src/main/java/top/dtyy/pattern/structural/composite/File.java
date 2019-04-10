package top.dtyy.pattern.structural.composite;

/**
 * 叶子类--Leaf
 *
 * @author lzp
 * @version v1.0 at 2019/4/10
 */
public class File extends AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName(AbstractFile file) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("文件名称：" + name);
    }
}
