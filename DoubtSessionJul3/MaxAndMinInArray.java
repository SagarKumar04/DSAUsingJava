package InfinityJune21.DoubtSessionJul3;

import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of testcases: ");
        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            System.out.println("Enter size of the array: ");
            int N = scanner.nextInt();
            int arr[] = new int[N];

            System.out.println("Enter " + N + " elements: ");
            for(int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }

            int min = arr[0];
            int max = arr[0];

            for(int j = 1; j < N; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                }
                if(arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println();
        }
    }
}
