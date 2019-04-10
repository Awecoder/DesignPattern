package top.dtyy.pattern.structural.composite;

/**
 * @author lzp
 * @version v1.0 at 2019/4/10
 */
public class Test {
    public static void main(String[] args) {
        AbstractFile textFile = new File("文本文件");
        AbstractFile audioFile = new File("音频文件");
        AbstractFile folder = new Folder("文件夹");
        folder.add(textFile);
        folder.add(audioFile);
        AbstractFile rootFolder = new Folder("根目录");
        rootFolder.add(folder);
        rootFolder.print();
    }
}
