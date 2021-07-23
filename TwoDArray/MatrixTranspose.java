package InfinityJune21.TwoDArray;

public class MatrixTranspose {
    public static void main(String[] args) {
        int n = 7, m = 3;
        int arr[][] = new int[n][m];
        int transpose[][] = new int[m][n];
        int element = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = element;
                element++;
            }
        }

        System.out.println("Original Array: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transposed Array: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%3d", transpose[i][j]);
            }
            System.out.println();
        }
    }
}
