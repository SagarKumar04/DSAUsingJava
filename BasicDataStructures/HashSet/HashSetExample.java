package InfinityJune21.BasicDataStructures.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<Integer>();
        a.add(3);
        a.add(9);
        a.add(12);
        a.add(0);
        a.add(13);
        a.add(22);

        for(Integer num : a) {
            System.out.println(num);
        }
    }
}
