package InfinityJune21.BasicDataStructures.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Infinity", 9);
        hashMap.put("BlackBird", 10);

        System.out.println(hashMap);
    }
}
