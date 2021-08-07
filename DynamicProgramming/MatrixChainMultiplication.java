package InfinityJune21.DynamicProgramming;

public class MatrixChainMultiplication {
    static int numberOfMultiplications(int arr[], int size) {
        int m[][] = new int[size][size];
        int i, j, k, l, q;

        for(i = 1; i < size; i++) {
            m[i][i]= 0;
        }

        for(l = 2; l < size; l++) {
            for(i = 1; i < (size - l + 1); i++) {
                j = i + l - 1;

                if(j == size) {
                    continue;
                }
                m[i][j] = Integer.MAX_VALUE;
                for(k = i; k <= (j - 1); k++) {
                    q = m[i][k] + m[k + 1][j] +
                            arr[i - 1] * arr[k] * arr[j];

                    if(q < m[i][j]) {
                        m[i][j] = q;
                    }
                }
            }
        }

        return m[1][size - 1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int size = arr.length;

        int result = numberOfMultiplications(arr, size);

        System.out.println(result);
    }
}
