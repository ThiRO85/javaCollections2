package application;

import java.util.function.Function;

@FunctionalInterface
interface Example3 {
    int method3(String s);
}

class ImplementsExample3 implements Example3 {
    @Override
    public int method3(String s) {
        return s.length();
    }
}

public class InvokeLambdaIII {

    public static void main(String[] args) {

        Example3 test = new ImplementsExample3();
        System.out.println(test.method3("Daniela"));

        Example3 test1 = String::length;
        System.out.println(test1.method3("Thiago"));

        Function<String, Integer> test2 = String::length;
        System.out.println(test2.apply("Lambda"));
    }
}
