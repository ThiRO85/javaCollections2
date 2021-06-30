package application;

import java.util.function.Consumer;

@FunctionalInterface
interface Example1 {
    void method1();
}

class ImplementsExample1 implements Example1 {
    @Override
    public void method1() {
        System.out.println("Function without any argument and return type!");
    }
}

public class InvokeLambda {

    public static void main(String[] args) {

        Example1 test = new ImplementsExample1();
        test.method1();

        Example1 test1 = () -> System.out.println("Implementing lambda!");
        test1.method1();

        Consumer test2 = (s) -> System.out.println(s);
        test2.accept("Implementing functional interface Consumer!");
    }
}
