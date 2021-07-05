package InfinityJune21.BasicDataStructures;

import java.util.TreeSet;

public class TreeClassExample {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(19);
        t.add(11);
        t.add(20);
        t.add(100);
        t.add(-10);
        t.add(-10); //duplicate not allowed

        System.out.println(t);
        System.out.println(t.size());
    }
}
