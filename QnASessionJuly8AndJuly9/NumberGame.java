package InfinityJune21.QnASessionJuly8AndJuly9;

public class NumberGame {
    public static void main(String[] args) {
        int N = 10;

        int arr[][] = new int[N + 1][10];

        for(int i = 0; i < 10; i++) {
            arr[0][i] = 1;
        }
        for(int i = 0; i <= N; i++) {
            arr[i][9] = 1;
        }

        for(int i = 1; i <= N; i++) {
            for(int j = 8; j >= 0; j--) {
                arr[i][j] = arr[i][j + 1] + arr[i - 1][j];
                //(a + b) % m = (a % m) + (b % m)
            }
        }

        for(int i = 0; i <= N; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("%10d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Answer: " + arr[N][1]);
    }
}
