package application;

interface TestInterface<T> {}

public interface GenericsInterface<T> extends TestInterface {

    public T getData();
    public void setData(T data);
}
