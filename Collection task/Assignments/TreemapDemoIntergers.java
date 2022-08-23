package Assignments;

import java.util.Comparator;
import java.util.TreeMap;
class  TreeeComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
 Integer s1=(Integer) o1;
Integer s2=(Integer) o2;
 //return  s1.compareTo(s2);
return - s1.compareTo(s2);// reverse order
    }
}
public class TreemapDemoIntergers {
    public static void main(String[] args) {
        TreeMap<Integer, String> T = new TreeMap<>(new TreeeComparator1());
        T.put(12, "green");
        T.put(14, "red");
        T.put(13, "Yellow");
        T.put(21, "pink");
        T.put(19, "gray");
        System.out.println(T.keySet());// natural sorting

    }

}
