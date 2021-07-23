package InfinityJune21.TwoDArray;

public class MatrixMultiplicstion {
    public static void main(String[] args) {
        int n1 = 5, n2 = 3, n3 = 6;
        int arr1[][] = new int[n1][n2];
        int arr2[][] = new int[n2][n3];
        int result[][] = new int[n1][n3];
        int element = 1;

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr1[i][j] = element;
                element++;
            }
        }
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                System.out.printf("%6d", arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < n2; i++) {
            for(int j = 0; j < n3; j++) {
                arr2[i][j] = element;
                element++;
            }
        }
        for(int i = 0; i < n2; i++) {
            for(int j = 0; j < n3; j++) {
                System.out.printf("%6d", arr2[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n3; j++) {
                for(int k = 0; k < n2; k++) {
                    result[i][j] = result[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n3; j++) {
                System.out.printf("%6d", result[i][j]);
            }
            System.out.println();
        }
    }
}