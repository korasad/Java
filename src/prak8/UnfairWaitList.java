package prak8;
import java.util.Collection;
public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList(){};
    public void remove(E element) {
        boolean add = content.add(content.peek());
        content.remove(add);
    }
    public void moveToBack(E element){
        remove(element);
        content.add(element);
    };
}