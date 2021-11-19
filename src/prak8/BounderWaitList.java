package prak8;


import java.util.Collection;

public class BounderWaitList<E> extends WaitList<E>{
    private int capacity;
    public BounderWaitList(int capacity){
        this.capacity = capacity;
    };

    public int getCapacity() {
        return capacity;
    }


    @Override
    public String toString() {
        return "com.company.BounderWaitList{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
