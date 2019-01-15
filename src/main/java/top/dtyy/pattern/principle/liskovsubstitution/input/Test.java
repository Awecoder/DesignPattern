package top.dtyy.pattern.principle.liskovsubstitution.input;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}