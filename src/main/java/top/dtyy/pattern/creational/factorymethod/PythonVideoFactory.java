package top.dtyy.pattern.creational.factorymethod;

/**
 * @author lzp
 * @version v1.0 at 2018/12/17
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
