package pl.sda.designpatterns.observer;

public interface Observer<T> {

    void update(Publisher<T> publisher, T data);

}
