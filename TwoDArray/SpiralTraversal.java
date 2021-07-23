package InfinityJune21.TwoDArray;

public class SpiralTraversal {
    public static void main(String[] args) {
        int n = 5, m = 3;
        long arr[][] = new long[n][m];

        int element = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = element;
                element++;
            }
        }

        System.out.println("Array: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Spiral Traversal: ");

        int rowStart = 0;
        int rowEnd = n - 1;
        int columnStart = 0;
        int columnEnd = m - 1;

        while(rowStart <= rowEnd && columnStart <= columnEnd) {
            //First Row
            for(int column = columnStart; column <= columnEnd; column++) {
                System.out.print(arr[rowStart][column] + " ");
            }
            rowStart++;

            //Last Column
            for(int row = rowStart; row <= rowEnd; row++) {
                System.out.print(arr[row][columnEnd] + " ");
            }
            columnEnd--;

            //Last Row
            if(rowStart <= rowEnd) {
                for(int column = columnEnd; column >= columnStart; column--) {
                    System.out.print(arr[rowEnd][column] + " ");
                }
                rowEnd--;
            }

            //First Column
            if(columnStart <= columnEnd) {
                for(int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(arr[row][columnStart] + " ");
                }
                columnStart++;
            }
        }
    }
}
