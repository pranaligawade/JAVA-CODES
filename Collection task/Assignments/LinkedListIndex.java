package Assignments;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIndex {
    public static void main(String[] args) {
        LinkedList l= new LinkedList(List.of(23,56,87,98,19,65,87,34,57));
        System.out.println(l);
        l.addFirst(30);
        l.addLast(79);
        System.out.println(l);
    }
}
