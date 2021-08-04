/**
 * @Description:  饿汉式（静态常量）（可用）
 * @Author: sunzhiyu
 * @CreateDate: 2021/2/14 08:11
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
