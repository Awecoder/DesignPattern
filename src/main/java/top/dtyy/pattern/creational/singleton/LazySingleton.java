package top.dtyy.pattern.creational.singleton;

/**
 * 懒汉式单例模式实现
 *
 * @author lzp
 * @version v1.0 at 2018/12/19
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static LazySingleton getInstance1() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

//    public static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }
}
