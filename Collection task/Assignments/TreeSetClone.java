package Assignments;

import java.util.TreeSet;

public class TreeSetClone {
    public static void main(String[] args) {
        TreeSet <Integer>t=new TreeSet<Integer>();
        t.add(12);
        t.add(34);
        t.add(76);
        t.add(44);
        t.add(98);
        System.out.println("Treeset :"+t);
        TreeSet h= (TreeSet) t.clone();
        System.out.println("after cloneing :"+h);
    }
}
