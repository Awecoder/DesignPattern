package top.dtyy.pattern.behavioral.command;

/**
 * @author lzp
 * @version v1.0 at 2019/4/15
 * @description: 具体命令--打开视频
 */
public class OpenVideoCommand implements Command {
    private VideoReceiver video; // 接收者对象

    public OpenVideoCommand(VideoReceiver video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.open();
    }
}
