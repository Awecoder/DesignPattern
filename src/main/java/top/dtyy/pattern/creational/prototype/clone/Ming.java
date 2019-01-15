package top.dtyy.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author lzp
 * @version v1.0 at 2018/12/25
 */
public class Ming implements Cloneable {
    private String name;
    private Date birthday;

    public Ming(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Ming{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + "\n" + super.toString();
    }

//    /**
//     * 浅拷贝
//     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Ming ming = (Ming) super.clone();
        // 深拷贝
        ming.birthday = (Date) ming.birthday.clone();
        return ming;
    }
}
