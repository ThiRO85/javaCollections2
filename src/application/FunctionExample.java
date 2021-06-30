package application;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        String test = "FunctionExample";
        int test1 = stringSize(test);
        System.out.println(test1);

        Function<String, Integer> func = String::length; //s -> s.length;
        int test2 = func.apply(test);
        System.out.println(test2);
    }

    private static int stringSize(String s) {
        return s.length();
    }
}
