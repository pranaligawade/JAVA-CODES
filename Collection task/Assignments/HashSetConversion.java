package Assignments;

import java.util.HashSet;

public class HashSetConversion {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(22);
        h.add(34);
        h.add(35);
        h.add(76);
        h.add(65);
        System.out.println(h);
        Integer[] str = new Integer[h.size()];
        h.toArray(str);

        for (int a : str) {
            System.out.println(a);
        }

    }
}
