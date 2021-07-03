package InfinityJune21.DoubtSessionJul3;

import java.util.Scanner;

public class NegativeIntegerWithoutBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];

        int isNegativePresent = 0; //0 - negative is not present

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();

            if(arr[i] < 0) {
                isNegativePresent = 1; //1 - negative is present
            }
        }

        if(isNegativePresent == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
