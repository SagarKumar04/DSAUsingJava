package InfinityJune21.HackathonDoubtSessionJul4;

import java.util.Arrays;
import java.util.Scanner;

public class KillTheMonster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int H = scanner.nextInt();

        int attackWeight[][] = new int[2][N];

        for(int i = 0; i < N; i++) {
            attackWeight[0][i] = scanner.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int weight = scanner.nextInt();
            if(weight > D) {
                attackWeight[0][i] = 0;
                attackWeight[1][i] = 0;
            }
            else {
                //totalAttackingPower = totalAttackingPower + attackWeight[0][i];
                attackWeight[1][i] = weight;
            }
        }

        Arrays.sort(attackWeight[0]);

        int weaponsCount = 0;
        int attackingPowerReached = 0;
        for(int i = attackWeight[0].length - 1; i >= 0 ; i--) {
            if(attackWeight[0][i] > 0) {
                attackingPowerReached = attackingPowerReached + attackWeight[0][i];
                weaponsCount = weaponsCount + 1;
                if(attackingPowerReached >= H) {
                    break;
                }
            }
        }

        if(attackingPowerReached >= H) {
            System.out.println(weaponsCount);
        }
        else {
            System.out.println("-1");
        }
    }
}
