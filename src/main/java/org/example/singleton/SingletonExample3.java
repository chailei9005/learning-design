package org.example.singleton;

/**
 * 懒汉式 , 线程安全, 使用关键字 synchronized  为什么不推荐使用
 */
public class SingletonExample3 {

    private SingletonExample3(){}

    private static SingletonExample3 instance;

    public static synchronized SingletonExample3 getInstance(){
        // 多个线程调用时 会创建多个对象
        if (instance == null) {
            instance = new SingletonExample3();
        }
        return  instance;
    }
}
