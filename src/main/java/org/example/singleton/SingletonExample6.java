package org.example.singleton;

/**
 * 饿汉式 , 线程安全, 静态代码块创建对象
 */
public class SingletonExample6 {

    private SingletonExample6(){}

    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    public static SingletonExample6 getInstance(){
        // 多个线程调用时 会创建多个对象
        return  instance;
    }
}
