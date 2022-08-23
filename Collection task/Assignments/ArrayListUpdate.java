package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>(Arrays.asList(22,34,56,76,98,58,34));
        System.out.println(al);
        al.add(9);//add element at the end;
        System.out.println(al);
       al.set(2,30);// add element at the specific index;
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al );
    }
}
