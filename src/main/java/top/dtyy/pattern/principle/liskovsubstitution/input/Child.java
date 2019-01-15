package top.dtyy.pattern.principle.liskovsubstitution.input;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzp
 * @version v1.0 at 2018/12/13
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行1");
//    }

    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行2");
    }
}
