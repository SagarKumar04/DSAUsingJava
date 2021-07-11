package InfinityJune21.DoubtSessionJuly11;

public class SimpleColours {
    final static int mod = 1000000007;

    public static void main(String[] args) {
        int N = 1;
        int K = 10;

        int totalCombinations = K;

        for(int i = 1; i < N; i++) {
            totalCombinations = totalCombinations * (K - 1);
            totalCombinations = totalCombinations % mod;
        }

        System.out.println(totalCombinations);
    }
}
