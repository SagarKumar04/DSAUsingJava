package InfinityJune21.DynamicProgramming;

public class LongestCommonSubsequence {
    static int calculateLCS(char X[], char Y[], int m, int n) {
        int L[][] = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0) {
                    L[i][j] = 0;
                }
                else if(X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                }
                else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char X[] = s1.toCharArray();
        char Y[] = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        int lengthOfLCS = calculateLCS(X, Y, m, n);

        System.out.println(lengthOfLCS);
    }
}
