/**
 * @Description: 懒汉式（线程安全）（不推荐）
 * @Author: sunzhiyu
 * @CreateDate: 2021/2/14 08:15
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
