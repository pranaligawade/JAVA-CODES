package com.idc.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>(Arrays.asList("pranali", "arru", "tanu", "jiya"));
        ArrayList<String> n = new ArrayList<>();
        System.out.println("before sorting :" + al);
        for (char c = 'a'; c <= 'z'; c++) {
            for (char l = 0; l < al.size(); l++) {
                if (c == al.get(l).charAt(0)) {
                    n.add(al.get(l));
                }
            }
        }

        System.out.println(" after sorting  :" + n);
    }
}
