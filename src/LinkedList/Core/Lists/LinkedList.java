package LinkedList.Core.Lists;

import org.w3c.dom.*;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertSendToTop(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            head = newNode;
            tail = newNode;
        }
        size++;
    }

    private void insertSendToEnd(T data) {
    }

    public int getSize() {
        return size;
    }
    public T getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("(");
        Node<T> current = head;
        while (current!= null) {
            result.append(current.data);
            if (current.next!= null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append(")");
        return result.toString();
    }
    public Iterator<T> iterator() {
        return new ListIterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public T previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(T t) {

            }

            @Override
            public void add(T t) {

            }
        };
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void removeFirst() {
        if (head ==  null) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }
    public void removeList() {
        if (isEmpty()) {
            return;
        } else if (size() == 1) {
            tail = null;
            head = null;
        } else {
            Node<T> secondToLast = null;
            Node<T> last = head;
            while (last.next != null) {
                secondToLast = last;
                last = last.next;
            }
            secondToLast.next = null;
            tail = secondToLast;
        }
        --size;
    }
    private int size() {
        return 0;
    }
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next!= null) {
                current.next.prev = current;
            } else {
                tail = current;
            }
            size--;
        }
    }
}
