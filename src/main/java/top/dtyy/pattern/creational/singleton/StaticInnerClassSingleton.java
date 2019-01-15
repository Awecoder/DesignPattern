package top.dtyy.pattern.creational.singleton;

/**
 * @author lzp
 * @version v1.0 at 2018/12/20
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
