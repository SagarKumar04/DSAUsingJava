package InfinityJune21.HackathonDoubtSessionJul4;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int smartness[] = new int[N];
        //smartness -> {2, 6, 1, 4, 5, 3, 8, 7}
        for(int i = 0; i < N; i++) {
            smartness[i] = scanner.nextInt();
        }

        Arrays.sort(smartness);
        //smartness -> {1, 2, 3, 4, 5, 6, 7, 8}

        int happinessSum = smartness[N - 1];

        for(int i = N - 2, x = 1; x < (N - 2); x += 2, i -= 1) {
            happinessSum = happinessSum + 2 * smartness[i];
        }

        System.out.println(happinessSum);
    }
}
