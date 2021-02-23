package org.example.singleton;

/**
 * 饿汉式 , 线程安全, 类加载的时候创建对象
 */
public class SingletonExample2 {

    private SingletonExample2(){}

    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance(){
        // 多个线程调用时 会创建多个对象
        return  instance;
    }
}
