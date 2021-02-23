package org.example.singleton;

/**
 * 枚举方式进行实例化，是线程安全的，此种方式也是线程最安全的
 */
public class SingletonExample7 {

    private SingletonExample7(){}

    private static SingletonExample7 instance = null;


    public static SingletonExample7 getInstance(){
        // 多个线程调用时 会创建多个对象
        return  Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample7 singleton;

        // 这个只执行一次
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance(){
            return singleton;
        }

    }
}
