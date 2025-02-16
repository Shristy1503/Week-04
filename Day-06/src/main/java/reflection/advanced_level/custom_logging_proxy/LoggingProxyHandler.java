package reflection.advanced_level.custom_logging_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name before execution
        System.out.println("Method called: " + method.getName());

        // Invoke the original method on the target object
        return method.invoke(target, args);
    }
}
