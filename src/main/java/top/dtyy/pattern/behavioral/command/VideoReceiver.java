package top.dtyy.pattern.behavioral.command;

/**
 * @author lzp
 * @version v1.0 at 2019/4/15
 * @description: 命令接收者
 */
public class VideoReceiver {
    private String name; // 视频名称

    public VideoReceiver(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("打开" + this.name);
    }

    public void close() {
        System.out.println("关闭" + this.name);
    }
}
