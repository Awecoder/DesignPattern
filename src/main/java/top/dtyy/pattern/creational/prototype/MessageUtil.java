package top.dtyy.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class MessageUtil {
    public static void sendMessage(Message message) {
        String content = "客户[{0}],手机号[{1}],内容[{2}],发送信息成功";
        System.out.println(MessageFormat.format(content, message.getName(),
                message.getPhone(), message.getContent()));
    }

    public static void saveOriginMessageRecord(Message message) {
        System.out.println("保存信息内容：" + message.getContent());
    }
}
