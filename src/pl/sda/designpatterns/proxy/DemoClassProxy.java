package pl.sda.designpatterns.proxy;

import netscape.security.ForbiddenTargetException;

public class DemoClassProxy extends DemoClass {

    @Override
    void doSomething() {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long timeDiff = end - start;
        System.out.println(timeDiff);

//        if(user.hasPermission("ADMIN")) {
//            super.doSomething();
//        } else {
//            throw new ForbiddenTargetException();
//        }
    }
}
