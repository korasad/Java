package prak8;

import java.util.Collection;

public interface IWaitList<E> {
    public void add(E element);
    public void remove(E element);
    public boolean contain(E element);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();

}
