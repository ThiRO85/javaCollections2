package entities;

import java.util.List;

public class Box<T> {

    private List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
