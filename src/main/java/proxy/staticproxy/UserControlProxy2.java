package proxy.staticproxy;

public class UserControlProxy2 extends UserControl {


    @Override
    public void login() {
        System.out.println("before login");
        super.login();
        System.out.println("after login");

    }

    @Override
    public void register() {
        System.out.println("before register");
        super.register();
        System.out.println("after register");

    }
}
