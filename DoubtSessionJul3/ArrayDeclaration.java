package InfinityJune21.DoubtSessionJul3;

import java.util.Scanner;

public class ArrayDeclaration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        //Test test[] = new Test[5]; -> array of objects of class 'Test'
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Elements of the array are: ");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr);
    }
}
