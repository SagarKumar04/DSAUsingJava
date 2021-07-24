package InfinityJune21.DoubtSessionJuly24;

import java.util.Scanner;

public class CutTheRope {
    static long possibleValues(int rope) {
        long numberOfWays = 1;

        for(int i = 1; i < 12; i++) {
            numberOfWays = numberOfWays * (rope-i);
            numberOfWays = numberOfWays / i;
        }

        return numberOfWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rope = sc.nextInt();
        long numberOfWays = possibleValues(rope);
        System.out.println(numberOfWays);
    }
}
