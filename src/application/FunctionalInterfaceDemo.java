package application;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    public void method1(); //Abstract Method

    default void method2() { //Default Method
    }

    static void method3() { //Static Method
    }
}
