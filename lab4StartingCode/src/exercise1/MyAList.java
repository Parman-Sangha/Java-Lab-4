package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E> {
    private ArrayList<E> list = new ArrayList<>();

    public void add(E item) { list.add(item); }

    public void addAll(MyAList<E> items) {
        for (E item : items) list.add(item);
    }

    public E get(int index) {
        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException("Invalid index: " + index);
        return list.get(index);
    }

    public void remove(int index) {
        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException("Invalid index: " + index);
        list.remove(index);
    }

    public void set(int index, E item) {
        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException("Invalid index: " + index);
        list.set(index, item);
    }

    public int size() { return list.size(); }

    public boolean isEmpty() { return list.isEmpty(); }

    public Object[] toArray() { return list.toArray(); }

    public void clear() { list.clear(); }

    public Iterator<E> iterator() { return list.iterator(); }
}