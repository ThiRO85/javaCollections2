package application;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> test = () -> "Supplier Example";
        System.out.println(test.get());
    }
}
