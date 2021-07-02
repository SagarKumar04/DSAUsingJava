package InfinityJune21.BasicDataStructures.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleRemovingElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            arrayList.add(i * 100);
        }

        System.out.println("ArrayList after adding elements: " + arrayList);

        //Remove on the basis of index
        arrayList.remove(2);
        System.out.println("ArrayList after removing element from index 2: " + arrayList);

        arrayList.remove(Integer.valueOf(400));
        System.out.println("ArrayList after removing element 400: " + arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(0);
        arrayList1.add(100);
        arrayList1.add(300);

        arrayList.removeAll(arrayList1);

        System.out.println("ArrayList after removing arrayList1: " + arrayList);
    }
}
