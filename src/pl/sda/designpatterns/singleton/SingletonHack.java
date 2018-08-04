package pl.sda.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class SingletonHack {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

//        new MultiThreadSIngleton();

        final MultiThreadSIngleton instance = MultiThreadSIngleton.getInstance();
//        instance.someString();

        final Optional<Method> someString = Arrays.stream(instance.getClass().getDeclaredMethods())
                .filter(method -> method.getName().equals("someString"))
                .findFirst();
        if(someString.isPresent()) {
            final Method method = someString.get();
            method.setAccessible(true);
            final String invoke = (String) method.invoke(instance);
            System.out.println(invoke);
        }


        System.out.println(instance.getUuid());

        final Constructor<?> constructor1 = Arrays.stream(MultiThreadSIngleton.class.getDeclaredConstructors())
                .filter(constructor -> constructor.getParameterCount() == 0)
                .findFirst().orElse(null);
        if(constructor1 != null) {
            constructor1.setAccessible(true);
            final MultiThreadSIngleton instance2 = (MultiThreadSIngleton) constructor1.newInstance();
            System.out.println(instance2.getUuid());
        }
    }
}
