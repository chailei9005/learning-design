package proxy.dynamicproxy;

import proxy.staticproxy.IUserControl;
import proxy.staticproxy.UserControl;

public class DynamicExample {

    public static void main(String[] args) {


        IUserControl userControl = (IUserControl) new MetricsCollectionProxy().createProxy(new UserControl());

        userControl.login();

        userControl.register();
    }
}
