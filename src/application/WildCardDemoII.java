package application;

import entities.DataNode;

public class WildCardDemoII {

    public static void main(String[] args) {

        DataNode<Integer> node1 = new DataNode<>(20, null);
        DataNode<Integer> node2 = new DataNode<>(35, node1);
        System.out.println(node2);
    }
}
