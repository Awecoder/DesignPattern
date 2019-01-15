package top.dtyy.pattern.creational.singleton;

/**
 * 懒汉模式线程辅助类
 *
 * @author lzp
 * @version v1.0 at 2018/12/19
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
