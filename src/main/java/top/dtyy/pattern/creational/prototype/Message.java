package top.dtyy.pattern.creational.prototype;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class Message implements Cloneable{
    private String name;
    private String phone;
    private String content;

    public Message() {
        System.out.println("Message constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone message object");
        return super.clone();
    }
}
