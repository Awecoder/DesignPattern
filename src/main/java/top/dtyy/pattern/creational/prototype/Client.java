package top.dtyy.pattern.creational.prototype;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Message message = new Message();
        message.setContent("初始化模板");
        System.out.println("初始化message：" + message);
        for (int i = 0; i < 10; i++) {
            Message messageTemp = (Message) message.clone();
            messageTemp.setName("姓名" + i);
            messageTemp.setPhone("00" + i);
            messageTemp.setContent("拥有6.9万闪电贷信用贷款额度");
            MessageUtil.sendMessage(messageTemp);
            System.out.println("克隆messageTemp" + messageTemp);
        }
        MessageUtil.saveOriginMessageRecord(message);
    }
}
