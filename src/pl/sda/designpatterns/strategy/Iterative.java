package pl.sda.designpatterns.strategy;

public class Iterative implements FibonacciAlgorithm {
    @Override
    public long getNthElement(int n) {
        long helper1 = 0;
        long helper2 = 1;
        long element = 1;
        for (int i = 1; i < n; i++) {
            element = helper1 + helper2;
            helper1 = helper2;
            helper2 = element;
        }
        return element;
    }
}
