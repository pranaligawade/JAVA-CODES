package Assignments;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> mp= new HashMap<>();
        mp.put(1,"Appu");
        mp.put(2,"Tanuu");
        mp.put(6,"jiya");
        mp.put(3,"archu");
        mp.put(4,"pratu");
        mp.put(5,"dikshi");
        System.out.println(mp);
        System.out.println("is their '5' key is present :"+ mp.containsKey(5));
        System.out.println("is  '10' key is present :"+mp.containsKey(10));
    }
}
