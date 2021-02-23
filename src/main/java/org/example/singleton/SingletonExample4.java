package org.example.singleton;

/**
 * 懒汉式, 双重锁同步锁单例模式 , 线程不安全,  JVM和CPU优化时，指令重排
 */
public class SingletonExample4 {

    private SingletonExample4(){}

    private static SingletonExample4 instance;

    public static  SingletonExample4 getInstance(){
        // 多个线程调用时 会创建多个对象
        if (instance == null) {
            synchronized (SingletonExample4.class){

                if (instance == null){

                    instance = new SingletonExample4();
                }
            }
        }
        return  instance;
    }
}
