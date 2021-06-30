package application;

interface DoubleColonExample {
    void method1();
}

class ImplementsDoubleColon {
    public static void main(String[] args) {
        DoubleColonExample test2 = DoubleColonMethodReference::method2;
        test2.method1();

        DoubleColonMethodReference obj = new DoubleColonMethodReference();
        DoubleColonExample test3 = obj::method3;
        test3.method1();
    }
}

public class DoubleColonMethodReference {

    public static void main(String[] args) {

        DoubleColonExample test = () -> System.out.println("Using lambda");
        test.method1();
    }

    public static void method2() {
        System.out.println("Using method reference");
    }

    public void method3() {
        System.out.println("Using method reference and non static method");
    }
}
