package top.dtyy.pattern.creational.singleton;

/**
 * 双重锁定与排坑
 * @author lzp
 * @version v1.0 at 2018/12/20
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){
    }
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1. 分配内存给这个对象
                    // 2. 初始化对象
                    // 3. 设置lazyDoubleCheckSingleton，指向刚分配的内存地址
                    // 在程序执行时，步骤2和3可能出现重排序
                    // 3. 设置lazyDoubleCheckSingleton，指向刚分配的内存地址
                    // 2. 初始化对象
                    // 因为3中的操作，先分配了内存，所以外部空判断时并不为空。
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
