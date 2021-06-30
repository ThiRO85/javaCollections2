package application;

import java.util.Arrays;
import java.util.List;

class GenericConstructor {
    private List list;

    public <T> GenericConstructor(List<T> list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }
}

public class GenericMethod {

    public static void main(String[] args) {

        System.out.println(concat("String!"));
        System.out.println(concat(10));
        System.out.println(concat('T'));
        System.out.println(concat(true));

        GenericConstructor gc = new GenericConstructor(Arrays.asList("Testing", 123, true));
        gc.getList().forEach(System.out::println);
    }

    static <T> String concat(T type) {
        return "Data is: " + type;
    }
}
