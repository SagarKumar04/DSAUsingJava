package InfinityJune21.BasicMaths.BooleanAlgebra;

public class Subsets {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c'};
        int n = arr.length;
        int twoPowerNMinus1 = (int)Math.pow(2, n);

        for(int i = 0; i < twoPowerNMinus1; i++) {
            for(int j = 0; j < n; j++) {
                int result = i & (1 << j);
                if(result != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
