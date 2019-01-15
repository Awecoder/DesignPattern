package top.dtyy.pattern.principle.liskovsubstitution.input;

import java.util.HashMap;

/**
 * @author lzp
 * @version v1.0 at 2018/12/13
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
