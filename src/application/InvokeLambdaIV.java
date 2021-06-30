package application;

import java.util.function.Function;

@FunctionalInterface
interface Example4 {
    double method4(int a);
}

class ImplementsExample4 implements Example4 {
    @Override
    public double method4(int a) {
        double pow = Math.pow(a, 2.0);
        pow += 10;
        return pow;
    }
}

public class InvokeLambdaIV {

    public static void main(String[] args) {

        Example4 test = new ImplementsExample4();
        System.out.println(test.method4(5));

        Example4 test1 = (a) -> {
            double x = Math.pow(a, 2.0);
            x += 10;
            return x;
        };
        System.out.println(test1.method4(5));

        Function<Integer, Double> test2 = (a) -> {
            double x = Math.pow(a, 2.0);
            x += 10;
            return x;
        };
        System.out.println(test2.apply(5));
    }
}
