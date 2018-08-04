package pl.sda.designpatterns.observer;

public interface Publisher<T> {

    void register(Observer<T> observer);

    void unregister(Observer<T> observer);

}
