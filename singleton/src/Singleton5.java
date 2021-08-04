/**
 * @Description: 懒汉式（线程不安全，同步代码块）（不推荐）
 * @Author: sunzhiyu
 * @CreateDate: 2021/2/14 08:16
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
