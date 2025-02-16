package reflection.advanced_level.custom_logging_proxy;

public class GreetingImpl implements Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
