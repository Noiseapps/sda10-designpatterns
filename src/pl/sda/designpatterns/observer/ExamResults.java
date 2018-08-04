package pl.sda.designpatterns.observer;

import java.util.HashMap;
import java.util.Map;

public class ExamResults {
    private Map<String, Double> results = new HashMap<>();

    void put(String studentId, Double result) {
        results.put(studentId, result);
    }

    public Map<String, Double> getResults() {
        return results;
    }
}
