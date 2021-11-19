package lab10;

import java.util.ArrayList;

//Задание 2
public class Sec {
    private ArrayList<Object> elements = new ArrayList<>();

    public void add(Object e) {
        this.elements.add(e);
    }

    public Object get(int index) {
        if (index >= this.elements.size())
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.elements.size());
        return (Object)this.elements.get(index);
    }

    @Override
    public String toString() {
        return "sec{" +
                "elements=" + elements +
                '}';
    }
}
