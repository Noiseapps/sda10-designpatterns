package pl.sda.designpatterns.singleton;

import java.util.UUID;

public enum EnumSingleton {
    INSTANCE;

    private final String uuid;

    EnumSingleton() {
        uuid = UUID.randomUUID().toString();
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
