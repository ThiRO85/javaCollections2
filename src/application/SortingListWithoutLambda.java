package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2) return 1;
        else if (i1 > i2) return -1;
        else return 0;
    }
}

public class SortingListWithoutLambda {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 2, 1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.sort(new MyComparator());
        System.out.println(list);

        Comparator<Integer> x = (i1, i2) -> {
            if (i1 < i2) return 1;
            else if (i1 > i2) return -1;
            else return 0;
        };
        list.sort(x);
        System.out.println(list);
    }
}
