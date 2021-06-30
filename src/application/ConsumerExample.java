package application;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> test = System.out::println; //s -> System.out.println(s);
        test.accept("Consumer Example");
    }
}
