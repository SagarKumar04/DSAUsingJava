package InfinityJune21.DoubtSessionJul3;

import java.util.Scanner;

public class SeasonOfLoveUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];

        /*
        white - 0
        yellow - 1
        red - 2
         */
        for(int i = 0; i < N; i++) {
            int remainder = i % 3;

            arr[i] = remainder;
        }

        int numberOfYellowRoses = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == 1) {
                numberOfYellowRoses = numberOfYellowRoses + 1;
            }
        }

        System.out.println(numberOfYellowRoses);
    }
}
