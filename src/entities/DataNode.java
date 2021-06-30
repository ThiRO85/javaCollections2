package entities;

public class DataNode<T> {

    private T data;
    private DataNode<T> next;

    public DataNode(T data, DataNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DataNode<T> getNext() {
        return next;
    }

    public void setNext(DataNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DataNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
