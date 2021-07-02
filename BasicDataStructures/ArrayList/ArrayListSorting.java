package InfinityJune21.BasicDataStructures.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(200);
        arrayList.add(100);
        arrayList.add(500);
        arrayList.add(300);
        arrayList.add(400);

        int arr1[] = new int[5];

        Object[] arr = arrayList.toArray();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
