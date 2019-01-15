package top.dtyy.pattern.creational.singleton;

/**
 * @author lzp
 * @version v1.0 at 2018/12/23
 */
public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("Enum method");
        }
    };
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
