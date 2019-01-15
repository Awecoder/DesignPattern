package top.dtyy.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Ming ming1 = new Ming("小明", new Date(0L));
        Ming ming2 = (Ming) ming1.clone();
        // 比较对象ming1和ming2
        System.out.println(ming1);
        System.out.println(ming2);
        System.out.println();

        ming1.getBirthday().setTime(100000000000000L);
        System.out.println(ming1);
        System.out.println(ming2);
    }
}
