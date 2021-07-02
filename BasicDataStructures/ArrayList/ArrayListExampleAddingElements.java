package InfinityJune21.BasicDataStructures.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExampleAddingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("ArrayList without any elements:");
        System.out.println(a);

        for(int i = 0; i < 5; i++) {
            a.add(i * 100);
            System.out.println(a);
        }
        System.out.println(a);
        a.add(4, 800);
        System.out.println(a);
    }
}
