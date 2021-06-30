package application;

import entities.Bin;
import entities.Box;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); //Type safety
        list.add("Joe");

        for (String obj : list) {
            String s = obj;
            System.out.println(s + "\n");
        }

        Box<Integer> box = new Box<>(Arrays.asList(1, 2, 3)); //Raw type

        for (Integer i : box.getList()) {
            System.out.println(i);
        }

        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("Testing Bin!");
        bin.setWetTrash(12345);
        System.out.println("Dry trash: " + bin.getDryTrash() + " and Wet trash: " + bin.getWetTrash());
    }
}
