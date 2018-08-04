package pl.sda.designpatterns.observer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class Professor implements Publisher<ExamResults> {

    private Set<Observer<ExamResults>> observers = new HashSet<>();
    private final ExamResults results = new ExamResults();

    @Override
    public void register(Observer<ExamResults> observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer<ExamResults> observer) {
        observers.remove(observer);
    }

    public void addResult(UUID studentId) {
        results.put(studentId.toString(), new Random().nextDouble());
        publishResults(results);
    }

    private void publishResults(ExamResults results) {
        for (Observer<ExamResults> observer : observers) {
            observer.update(results);
        }
    }
}
