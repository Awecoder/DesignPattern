package top.dtyy.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 解决了序列化问题的单例模式
 */
public class ImproveHungrySingleton implements Serializable {
    private final static ImproveHungrySingleton ImproveHungrySingleton = new ImproveHungrySingleton();

    private ImproveHungrySingleton() {
    }

    public static ImproveHungrySingleton getInstance() {
        return ImproveHungrySingleton;
    }

    private Object readResolve(){
        return ImproveHungrySingleton;
    }
}