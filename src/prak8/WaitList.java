package prak8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected  ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<>();
    public WaitList() {};

    public WaitList(Collection<E> c){};

    @Override
    public String toString() {
        return super.toString();
    }


    public  void add(E element){
        content.add(element);
    };
    public  void remove(E element){
        content.remove();
    };
    public  boolean contain(E element) {
        return content.contains(element);
    }

    public  boolean containsAll(Collection c){
        return content.containsAll(c);
    };
    public  boolean isEmpty() {
        return content.isEmpty();
    };

    public void printQ(){
        while (!content.isEmpty()) {
            System.out.println(content.poll());
        }
    }

}