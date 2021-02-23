package proxy.staticproxy;

public class UserControlProxy implements IUserControl {

    private IUserControl userControl;

    public UserControlProxy(IUserControl userControl) {
        this.userControl = userControl;
    }

    public void login() {

        System.out.println("登录之前进行的操作");
        userControl.login();
        System.out.println("登录之后进行的操作");

    }

    public void register() {
        System.out.println("注册之前进行的操作");
        userControl.register();
        System.out.println("注册之后进行的操作");
    }
}
