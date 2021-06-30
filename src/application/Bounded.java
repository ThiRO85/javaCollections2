package application;

import entities.DataSorter;

import java.util.Arrays;
import java.util.List;

public class Bounded {

    public static void main(String[] args) {

        List<Integer> test = Arrays.asList(1, 2, 3);
        List<String> test1 = Arrays.asList("one", "two", "three");

        DataSorter<Integer> data = new DataSorter<>(test);
        data.getSortedData();

        DataSorter<String> data1 = new DataSorter<>(test1);
        data1.getSortedData();

        getSortedDataTest(test);
        //getSortedDataTest(test1); Compile error
    }

    static <T extends Number> void getSortedDataTest(List<T> list) {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }
 }
