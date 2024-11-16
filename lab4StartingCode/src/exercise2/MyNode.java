package exercise2;

public class MyNode<E> {
    E data;
    MyNode<E> prev, next;

    public MyNode(E data) {
        this.data = data;
    }

    public E getElement() { return data; }

    public MyNode<E> getNext() { return next; }

    public MyNode<E> getPrev() { return prev; }
}