package top.dtyy.pattern.behavioral.command;

/**
 * @author lzp
 * @version v1.0 at 2019/4/15
 * @description:
 */
public class CloseVideoCommand implements Command {
    private VideoReceiver video; // 接收者对象

    public CloseVideoCommand(VideoReceiver video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.close();
    }
}
