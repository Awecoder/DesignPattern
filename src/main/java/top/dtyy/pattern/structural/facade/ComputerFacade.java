package top.dtyy.pattern.structural.facade;

/**
 * @author lzp
 * @version v1.0 at 2018/12/27
 */
public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        // 在Spring中可以通过注入实现
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }


//    public ComputerFacade(Cpu cpu, Memory memory, Disk disk) {
//        this.cpu = cpu;
//        this.memory = memory;
//        this.disk = disk;
//    }

    public void startUp() {
        System.out.println("------启动计算机!------");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("------启动计算机完成!------");
    }

    public void shutDown() {
        System.out.println("------关闭计算机!------");
        disk.shutDown();
        memory.shutDown();
        cpu.shutDown();
        System.out.println("------关闭计算机完成!------");
    }
}
