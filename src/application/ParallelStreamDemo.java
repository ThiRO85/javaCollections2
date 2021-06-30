package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();
        long time1, time2, duration;

        for (int i=0; i<10; i++) {
            list.add(new Employee("Maria", 2000.0));
            list.add(new Employee("Joe", 3000.0));
            list.add(new Employee("Louise", 3500.0));
            list.add(new Employee("Alex", 4000.0));
            list.add(new Employee("Carl", 1500.0));
        }

        //Sequential processing
        time1 = System.currentTimeMillis();
        System.out.println("Sequential stream count: " + list.stream().filter(e -> e.getSalary() > 2000.0).count());

        time2 = System.currentTimeMillis();
        duration = time2 - time1;
        System.out.println("Sequential stream time taken: " + duration + "\n");

        //Parallel processing
        time1 = System.currentTimeMillis();
        System.out.println("Parallel stream count: " + list.parallelStream().filter(e -> e.getSalary() > 2000.0).count());

        time2 = System.currentTimeMillis();
        duration = time2 - time1;
        System.out.println("Parallel stream time taken: " + duration);
    }
}
