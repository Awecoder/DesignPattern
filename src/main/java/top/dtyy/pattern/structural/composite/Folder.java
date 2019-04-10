package top.dtyy.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器类-- Composite
 *
 * @author lzp
 * @version v1.0 at 2019/4/10
 */
public class Folder extends AbstractFile {
    private List<AbstractFile> items = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        items.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        items.remove(file);
    }

    @Override
    public String getName(AbstractFile file) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (AbstractFile item : items) {
            item.print();
        }
    }
}
