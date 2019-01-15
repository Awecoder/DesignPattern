package top.dtyy.pattern.structural.facade;

/**
 * @author lzp
 * @version v1.0 at 2018/12/27
 */
public class Client<main> {
    public static void main(String[] args) {
        ComputerFacade cf = new ComputerFacade();
        cf.startUp();
        cf.shutDown();
    }
}
