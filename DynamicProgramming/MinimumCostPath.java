package InfinityJune21.DynamicProgramming;

public class MinimumCostPath {
    static int min(int num1, int num2, int num3) {
        int smallest;

        if(num1 < num2) {
            if(num1 < num3) {
                smallest = num1;
            }
            else {
                smallest = num3;
            }
        }
        else {
            if(num2 < num3) {
                smallest = num2;
            }
            else {
                smallest = num3;
            }
        }

        /*
        smallest = (num1 < num2) ?
                ((num1 < num3) ? num1 : num3) :
                ((num2 < num3) ? num2 : num3);
        smallest = Math.min(Math.min(num1, num2), num3);
         */

        return smallest;
    }
    static int minimumCost(int cost[][], int m, int n) {
        int totalCost[][] = new int[m + 1][n + 1];

        totalCost[0][0] = cost[0][0];

        //Initialize first row
        for(int i = 1; i <= n; i++) {
            totalCost[0][i] = totalCost[0][i - 1] + cost[0][i];
        }

        //Initialize first column
        for(int i = 1; i <= m; i++) {
            totalCost[i][0] = totalCost[i - 1][0] + cost[i][0];
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                totalCost[i][j] = cost[i][j] +
                        min(
                                totalCost[i - 1][j - 1],
                                totalCost[i - 1][j],
                                totalCost[i][j - 1]
                        );
            }
        }

        return totalCost[m][n];
    }
    public static void main(String[] args) {
        int cost[][] = {
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3},
                {2, 4, 6}
        };
        int m = 3, n = 2;

        int result = minimumCost(cost, m, n);

        System.out.println(result);
    }
}
