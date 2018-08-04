package pl.sda.designpatterns.strategy;

import java.util.Random;

public class FibonacciMain {

    public static void main(String[] args) {
        final FibonacciAlgorithm iterative = new Iterative();
        final FibonacciAlgorithm recursive = new Recursive();

        final FibonacciAlgorithm[] algorithms = {iterative, recursive};

        final Calculator calculator = new Calculator();
        for (int i = 0; i < 100; i++) {
            final int i1 = new Random().nextInt(2);
            long start = System.currentTimeMillis();
            calculator.setStrategy(algorithms[i1]);
            long result = calculator.calculateForN(i);
            double time = (System.currentTimeMillis() - start) / 1000.0;
            System.out.printf("%d %d %d %fs\n", i, i1, result, time);
        }


//        calculator.setStrategy(iterative);
//
//        calculator.setStrategy(recursive);
//        System.out.println(calculator.calculateForN(10));


//        for (int i = 0; i < 30; i++) {
//            final int i1 = iterative.getNthElement(i);
//            final int i2 = recursive.getNthElement(i);
//            System.out.printf("%d: %d ; %d (%s)\n", i, i1, i2, i1 == i2);
//        }
    }
}
