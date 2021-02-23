package singleton;

import org.example.singleton.SingletonExample1;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void Singleton1() {

        SingletonExample1 instance = SingletonExample1.getInstance();
        System.out.println(instance);
    }
}
