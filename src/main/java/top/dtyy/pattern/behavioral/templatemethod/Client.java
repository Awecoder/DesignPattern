package top.dtyy.pattern.behavioral.templatemethod;

/**
 * @author lzp
 * @version v1.0 at 2019/4/11
 * @description: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        FlashContext flAcsQrc = new FlAcsQrc();
        flAcsQrc.process();
        System.out.println("-----分割线-----");
        FlashContext flSceQrc = new FlSceQrc();
        flSceQrc.process();
    }
}
