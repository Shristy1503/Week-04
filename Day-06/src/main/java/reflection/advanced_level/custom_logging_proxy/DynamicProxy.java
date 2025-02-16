package reflection.advanced_level.custom_logging_proxy;

import java.lang.reflect.Proxy;


public class DynamicProxy {
    public static void main(String[] args) {
        // Create the original object
        Greeting realGreeting = new GreetingImpl();

        // Create a proxy instance
        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(realGreeting)
        );

        // Call the method on the proxy (which will log before execution)
        proxyGreeting.sayHello("Shristy");
    }
}
