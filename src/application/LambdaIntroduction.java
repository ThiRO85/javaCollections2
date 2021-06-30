package application;

interface MyFunctionalInterface {
    void firstMethod();
}

class CallFirstMethod implements MyFunctionalInterface {
    @Override
    public void firstMethod() {
        System.out.println("Functional interface test!");
    }
}

public class LambdaIntroduction {

    public static void main(String[] args) {

        MyFunctionalInterface test = new CallFirstMethod();
        test.firstMethod();

        MyFunctionalInterface test1 = () -> System.out.println("Functional interface lambda test!");
        test1.firstMethod();
    }
}
