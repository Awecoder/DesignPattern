package top.dtyy.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version v1.0 at 2019/4/15
 * @description: 触发器
 */
public class Invoker {
    private List<Command> commandList = new ArrayList<>();

    // 命令列表添加命令
    public void addCommand(Command command) {
        commandList.add(command);
    }

    // 按序执行列表中的命令
    public void executeCommands() {
        for(Command command : commandList) {
            command.execute();
        }
        // 执行完后清空触发器中命令列表
        commandList.clear();
    }
}
