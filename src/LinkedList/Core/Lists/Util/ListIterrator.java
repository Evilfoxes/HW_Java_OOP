package LinkedList.Core.Lists.Util;

import LinkedList.Core.Lists.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterrator<T> implements Iterator<T> {
    private Node<T> head;
    private T data;
    private Node<T> current = head;

    @Override
    public boolean hasNext() {
        return current!= null;
    }
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        data = current.data;
        current = current.next;
        return data;
    }
}
