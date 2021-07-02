package InfinityJune21.BasicDataStructures.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleRetrieveElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            arrayList.add(i * 100);
        }

        System.out.println("ArrayList elements:");
        System.out.println(arrayList);

        int size = arrayList.size();

        System.out.println("Each element of ArrayList: ");
        for(int i = 0; i < size; i++) {
            int number = arrayList.get(i);
            System.out.println("Number: " + number);
        }

        System.out.println("Contains 500?: " + arrayList.contains(400));
    }
}
