package lab10;

import java.util.ArrayList;
//Задание 1
public class One {
    public <E> ArrayList<E>  ArrayToArrayList(E[] a) {
        ArrayList<E> lst = new ArrayList<>();
        for (E e : a) lst.add(e);
        return lst;
    }
    public <E> E getElemetn(int index, E[] arr)
    {
        if(index < arr.length)
            return arr[index];
        else
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arr.length);

    }
}
