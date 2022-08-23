package com.idc.day5;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList <Integer> al= new ArrayList<Integer>();
        ArrayList <String>al1= new ArrayList<String>();
        al.add(12);
        al.add(45);
        al.add(68);
        al.add(9);
        al.add(909);
        System.out.println("before sorting :"+al);
        Collections.sort(al);
        System.out.println("after sorting  :"+al);
        al1.add("pranu");
        al1.add("arru");
        al1.add("dikshi");
        al1.add("jiya");
        Collections.sort(al1);
        System.out.println(al1);
    }
}
