package pl.sda.designpatterns.observer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class Professor implements Publisher<ExamResults> {

    private final ExamResults results = new ExamResults();
    private int publishCount = 0;
    private Set<Observer<ExamResults>> observers = new HashSet<>();

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

        if (++publishCount % 5 == 0) {
            publishResults(results);
        }
    }

    private void publishResults(ExamResults results) {
        for (Observer<ExamResults> observer : new HashSet<>(observers)) {
            observer.update(this, results);
        }
        System.out.println();
        System.out.println();
    }
}
