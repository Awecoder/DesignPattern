package top.dtyy.pattern.creational.singleton.clone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton singleton = HungrySingleton.getInstance();
        Method method = HungrySingleton.class.getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneSingleton = (HungrySingleton) method.invoke(singleton);
        System.out.println(singleton);
        System.out.println(cloneSingleton);
    }
}
