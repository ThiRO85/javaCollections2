package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamIntroduction {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 1, 2);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        Predicate<Integer> pred = y -> y >= 3;

        for (Integer i : list) {
            if (pred.test(i)) {
                list2.add(i);
            }
        }
        System.out.println(list2);

        List<Integer> list3 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()); //filter(Predicate<T> i):
        System.out.println(list3);

        List<Integer> list4 = list.stream().map(x -> x * 2) .collect(Collectors.toList()); //map(Function<T, R> t):
        System.out.println(list4);

        long count = list.stream().filter(x -> x != 3).count();
        System.out.println(count);

        int sum = list.stream().filter(x -> x != 3).reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        int sum2 = list.stream().filter(x -> x != 3).reduce(0, Integer::sum);
        System.out.println(sum2);

        List<Integer> list5 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list5);

        List<Integer> list6 = list.stream().sorted((x1, x2) -> x2.compareTo(x1)).collect(Collectors.toList());
        System.out.println(list6);
    }
}
