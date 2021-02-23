package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MetricsCollectionProxy {

    public MetricsCollectionProxy() {
    }


    public Object createProxy(Object object) {
        Class<?>[] interfaces = object.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(object);

        return Proxy.newProxyInstance(object.getClass().getClassLoader(), interfaces, dynamicProxyHandler);
    }



    private class DynamicProxyHandler implements InvocationHandler{

        private Object object;

        public DynamicProxyHandler(Object object) {
            this.object = object;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("方法执行前");

            Object invoke = method.invoke(object, args);

            System.out.println("方法执行后");

            return invoke;
        }
    }
}
