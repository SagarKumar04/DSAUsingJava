package InfinityJune21.DoubtSessionJuly11;

import java.util.Scanner;

public class KthRowOfPascalsTriangleTwoLoops {
    final static int mod = 1000000007;
    static long pascalsTriangle[][] = new long[3001][3001];

    public static void preparePascalsTriangle() {
        for(int i = 0; i <= 3000; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    pascalsTriangle[i][j] = 1;
                }
                else {
                    pascalsTriangle[i][j] = ((pascalsTriangle[i - 1][j] % mod)
                            + (pascalsTriangle[i - 1][j - 1] % mod)) % mod;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        k = k + 1;

        preparePascalsTriangle();

        for(int i = 0; i < k; i++) {
            System.out.print(pascalsTriangle[k - 1][i] + " ");
        }
    }
}
