package entities;

import application.GenericsInterface;

class GenericsTest<T> {}

public class Generics<T> extends GenericsTest<T> implements GenericsInterface<T> {

    private T data;

    public Generics(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data is: " + data;
    }
}
