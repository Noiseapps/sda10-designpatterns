package pl.sda.designpatterns.factorymethod;

import java.util.Map;

public class User {

    private String email;
    private String name;
    private String department;


    static User from(UserData data) {
        return new User();
    }

    static User from(Map<String, String> params) {
        return new User();
    }
}
