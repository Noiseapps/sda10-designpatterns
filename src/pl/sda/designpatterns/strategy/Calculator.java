package pl.sda.designpatterns.strategy;

public class Calculator {

    private FibonacciAlgorithm strategy;

    public void setStrategy(FibonacciAlgorithm strategy) {
        this.strategy = strategy;
    }

    public long calculateForN(int n) {
        return strategy.getNthElement(n);
    }
}
