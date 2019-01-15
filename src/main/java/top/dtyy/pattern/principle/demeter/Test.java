package top.dtyy.pattern.principle.demeter;

/**
 * @author lzp
 * @version v1.0 at 2018/12/11
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
