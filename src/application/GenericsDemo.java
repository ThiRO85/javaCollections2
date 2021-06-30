package application;

import entities.Generics;

public class GenericsDemo {

    public static void main(String[] args) {

        Generics<String> test = new Generics<>("Test!");
        System.out.println(test.toString());

        Generics<Integer> test2 = new Generics<>(10);
        System.out.println(test2.toString());

        GenericsInterface<String> test3 = new Generics<>("Generic interface implemented!");
        System.out.println(test3.toString());
    }
}
