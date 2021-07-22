package InfinityJune21.TwoDArray;

public class TwoDArraySimpleExample {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 6;
        int twoD[][] = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                twoD[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
