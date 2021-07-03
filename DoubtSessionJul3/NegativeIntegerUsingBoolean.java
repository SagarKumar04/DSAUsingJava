package InfinityJune21.DoubtSessionJul3;

import java.util.Scanner;

public class NegativeIntegerUsingBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];

        boolean isNegativePresent = false;

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();

            if(arr[i] < 0) {
                isNegativePresent = true;
            }
        }

        if(isNegativePresent) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
