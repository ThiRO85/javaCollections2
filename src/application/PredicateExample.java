package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double salary = 1000.0;
        boolean result = salaryCheck(salary, amount);
        System.out.println("Without lambda: " + result);

        Predicate<Double> pred = s -> salary >= amount;
        boolean result2 = pred.test(amount);
        System.out.println("With lambda: " + result2);

        sc.close();
    }

    private static boolean salaryCheck(double salary, double amount) {
        return salary >= amount;
    }
}
