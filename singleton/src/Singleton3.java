/**
 * @Description:  懒汉式（线程不安全）
 * @Author: sunzhiyu
 * @CreateDate: 2021/2/14 08:14
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
