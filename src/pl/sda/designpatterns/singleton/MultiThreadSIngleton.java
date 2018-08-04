package pl.sda.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.UUID;

public class MultiThreadSIngleton {

    private final String uuid;

    private static MultiThreadSIngleton INSTANCE;


    private String someString() {
        return "test";
    }

    public synchronized static MultiThreadSIngleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MultiThreadSIngleton();
        }
        return INSTANCE;
    }

    private MultiThreadSIngleton() {
        uuid = UUID.randomUUID().toString();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                final MultiThreadSIngleton instance = MultiThreadSIngleton.getInstance();
//                System.out.println(instance.uuid);
//            }
//        });
//        Thread threadB = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                final MultiThreadSIngleton instance = MultiThreadSIngleton.getInstance();
//                System.out.println(instance.uuid);
//            }
//        });
//        threadA.start();
//        threadB.start();

//        final MultiThreadSIngleton instance2 = MultiThreadSIngleton.getInstance();
//        System.out.println(instance2.uuid);


    }

    public String getUuid() {
        return uuid;
    }
}
