package InfinityJune21.BasicMaths.Combinations;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1};
        int size = arr.length;
        int count = 0;
        int sum = 6;

        for(int i = 0; i < size; i++) {
            for(int j = (i + 1); j < size; j++) {
                int s = arr[i] + arr[j];

                if(s == sum) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
    }
}
