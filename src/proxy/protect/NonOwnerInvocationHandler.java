package proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.startsWith("get") || methodName.equals("setHotOrNotRating")) {
            return method.invoke(person, args);
        } else if (methodName.startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
