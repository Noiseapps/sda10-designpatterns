package pl.sda.designpatterns.strategy;

public class Recursive implements FibonacciAlgorithm {
    @Override
    public long getNthElement(int n) {
        if(n == 0) {
            return 0;
        }
        if(n <= 2) {
            return 1;
        }
        return getNthElement(n-1) + getNthElement(n-2);
    }
}
