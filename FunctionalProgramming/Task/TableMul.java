package Task;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TableMul {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : ");
        int n= sc.nextInt();
     //   IntStream.range(1,11).map(ele->ele*n).forEach(System.out::println);
        List<?>list=IntStream.range(1,11).map(ele->ele*n).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        System.out.println(list);
    }
}
