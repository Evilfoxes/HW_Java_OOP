package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.addFirst(1);
        list.addLast(6);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.addAll(1, Collections.singleton(10));
        System.out.println(list);

        System.out.println("Size list: " + list.size());
        System.out.println("Element with index 0: " + list.isEmpty());
    }
}
