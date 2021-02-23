package org.example.singleton;

/**
 * 懒汉式, 双重锁同步锁单例模式 , 线程安全,  JVM和CPU优化时，指令重排
 */
public class SingletonExample5 {

    private SingletonExample5(){}

    // volatile 禁止指令重排
    private volatile static  SingletonExample5 instance;

    public static SingletonExample5 getInstance(){
        // 多个线程调用时 会创建多个对象
        if (instance == null) {
            synchronized (SingletonExample5.class){

                if (instance == null){

                    instance = new SingletonExample5();
                }
            }
        }
        return  instance;
    }
}
