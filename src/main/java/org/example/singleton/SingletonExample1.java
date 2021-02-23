package org.example.singleton;

/**
 * 懒汉式 , 线程不安全
 */
public class SingletonExample1 {

    private SingletonExample1(){}

    private static SingletonExample1 instance;

    public static SingletonExample1 getInstance(){
        // 多个线程调用时 会创建多个对象
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return  instance;
    }
}
