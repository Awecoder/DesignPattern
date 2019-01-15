package top.dtyy.pattern.creational.singleton;

/**
 * @author lzp
 * @version v1.0 at 2018/12/19
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new MyThread());
//        Thread t2 = new Thread(new MyThread());
//        t1.start();
//        t2.start();
//        System.out.println("program end!");

//        // 创建对象
//        HungrySingleton instance = HungrySingleton.getInstance();
//        // 序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//        // 反序列化
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        // 通过反射将构造权限置为true
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton instance = LazySingleton.getInstance();
//        LazySingleton newInstance = (LazySingleton) objectClass.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Class objectClass = EnumInstance.class;
//////        Constructor constructor = (Constructor) objectClass.getDeclaredConstructor(String.class, int.class);
//////        constructor.setAccessible(true);
//////        EnumInstance instance = (EnumInstance) constructor.newInstance("lzp", 666);
//            EnumInstance instance = EnumInstance.getInstance();
//            instance.printTest();


        System.out.println("main Thread"+ ThreadLocalInstance.getInstance());
        System.out.println("main Thread"+ ThreadLocalInstance.getInstance());
        System.out.println("main Thread"+ ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("program end!");
    }
}
