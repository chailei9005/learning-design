package proxy.staticproxy;

// 静态代理模式

/**
 * 1. 原始类(UserControl)和代理类(UserControlProxy)实现同一个接口(UserControl)
 * 2. 代理类持有原始类的对象，实现接口的方法
 * 3. 在代理类实现的方法可以添加一些额外的功能
 *
 *
 * 有一种情况是原始类不是我们开发的，这时候就需要代理类继承原始类实现代理模式
 */


public class ProxyExample {

    public static void main(String[] args) {

        UserControlProxy userControlProxy = new UserControlProxy(new UserControl());

        userControlProxy.login();
        System.out.println("==============");
        userControlProxy.register();


        System.out.println("==============");


        UserControlProxy2 userControlProxy2 = new UserControlProxy2();
        userControlProxy2.login();
        userControlProxy2.register();

        for (Class<?> obj:new UserControl().getClass().getInterfaces()){
            System.out.println(obj);
        }

    }
}
