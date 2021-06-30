package application;

import entities.Box;
import entities.SquareBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubTyping {

    public static void main(String[] args) {

        Object obj = new Object();
        Integer i = Integer.valueOf(10);
        obj = i;

        List<Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(15));
        numbers.add(Double.valueOf(18.5));

        List<Box<Integer>> list = new ArrayList<>();
        list.add(new Box<>(Arrays.asList(1, 2, 3)));
        list.add(new SquareBox<>(Arrays.asList(4, 5, 6)));
    }
}
