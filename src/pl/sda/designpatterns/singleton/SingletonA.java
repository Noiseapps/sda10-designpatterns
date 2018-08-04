package pl.sda.designpatterns.singleton;

public class SingletonA {

    private static SingletonA INSTANCE;

    public static SingletonA getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonA();
        }
        return INSTANCE;
    }

    private SingletonA() {
    }

    public static void main(String[] args) {
        final SingletonA instance = SingletonA.getInstance();
        final SingletonA instance2 = SingletonA.getInstance();
        final SingletonA instance3 = SingletonA.getInstance();

        System.out.println(instance == instance2);
        System.out.println(instance == instance3);
        System.out.println(instance3 == instance2);
    }
}
