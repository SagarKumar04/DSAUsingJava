package InfinityJune21.BasicMaths.BooleanAlgebra;

public class UniqueNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, 3, 2, 1};
        int n = arr.length;
        int xorResult = 0;

        for(int i = 0; i < n; i++) {
            xorResult = xorResult ^ arr[i];
        }

        System.out.println(xorResult);
    }
}
