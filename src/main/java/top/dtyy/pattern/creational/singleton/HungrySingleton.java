package top.dtyy.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author lzp
 * @version v1.0 at 2018/12/20
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
