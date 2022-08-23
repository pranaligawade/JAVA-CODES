package Assignments;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
class  TreeeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
 String s1=(String) o1;
 String s2=(String) o2;
 return  s1.compareTo(s2);
//return - s1.compareTo(s2);// reverse order
    }
}
public class TreemapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> T = new TreeMap<>(new TreeeComparator());
        T.put("12", "green");
        T.put("15", "red");
        T.put("14", "Yellow");
        T.put("20", "pink");
        T.put("18", "gray");
        System.out.println(T.keySet());// natural sorting

    }

}
