package application;

import java.util.function.Consumer;

@FunctionalInterface
interface Example2 {
    void method2(int a, int b);
}

class ImplementsExample2 implements Example2 {
    @Override
    public void method2(int a, int b) {
        if (a > b) System.out.println("True");
        else System.out.println("False");
        System.out.println("Value of 'a' is: " + a + ", and value of 'b' is: " + b);
    }
}

public class InvokeLambdaII {

    public static void main(String[] args) {

        Example2 test = new ImplementsExample2();
        test.method2(10, 8);

        Example2 test1 = (a, b) -> {
            if (a > b) System.out.println("True");
            else System.out.println("False");
            System.out.println("Value of 'a' is: " + a + ", and value of 'b' is: " + b);
        };
        test1.method2(8, 10);

        /*Consumer<Integer> test2 = (a, b) -> {
            if (a > b) System.out.println("True");
            else System.out.println("False");
            System.out.println("Value of 'a' is: " + a + ", and value of 'b' is: " + b);
        };
        test2.accept(8, 10);*/
    }
}
