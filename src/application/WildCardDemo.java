package application;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        displayData(list1);
        displayWildCardData(list1);
        displayLowerBoundedWCD(list1);

        List<Double> list2 = Arrays.asList(1.5, 2.5, 3.5);
        displayData(list2);
        displayWildCardData(list2);
        //displayLowerBoundedWCD(list2); Compile error
    }

    static <T> void displayData(List<T> list) {
        list.forEach(System.out::print);
    }

    static void displayWildCardData(List<?> list) {
        list.forEach(System.out::print);
    }

    static void displayLowerBoundedWCD(List<? super Integer> list) {
        list.forEach(System.out::print);
    }
}
