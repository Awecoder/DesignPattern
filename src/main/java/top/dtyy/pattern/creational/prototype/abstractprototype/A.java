package top.dtyy.pattern.creational.prototype.abstractprototype;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
