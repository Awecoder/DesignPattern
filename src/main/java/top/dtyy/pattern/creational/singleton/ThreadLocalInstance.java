package top.dtyy.pattern.creational.singleton;

/**
 * @author lzp
 * @version v1.0 at 2018/12/23
 */
public class ThreadLocalInstance {
    private ThreadLocalInstance() {
    }

    private static final ThreadLocal<ThreadLocalInstance> instanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance() {
        return instanceThreadLocal.get();
    }
}
