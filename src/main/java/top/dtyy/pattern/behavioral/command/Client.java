package top.dtyy.pattern.behavioral.command;

import top.dtyy.pattern.creational.abstractfactory.Video;

/**
 * @author lzp
 * @version v1.0 at 2019/4/15
 * @description: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        // 初始化接收器
        VideoReceiver video = new VideoReceiver("命令模式Video");
        // 初始化命令
        Command opendCommand = new OpenVideoCommand(video);
        Command closeCommand = new CloseVideoCommand(video);
        // 触发器
        Invoker invoker = new Invoker();
        invoker.addCommand(opendCommand);
        invoker.addCommand(closeCommand);
        invoker.executeCommands();
    }
}
