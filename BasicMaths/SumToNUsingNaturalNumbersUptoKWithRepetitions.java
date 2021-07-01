package InfinityJune21.BasicMaths;

public class SumToNUsingNaturalNumbersUptoKWithRepetitions {
    static int numberOfWays(int N, int K) {
        int waysCount[] = new int[N + 1];

        waysCount[0] = 1;

        //Iterate from 1 to K
        for(int i = 1; i <= K; i++) {
            //Iterate from 1 to N
            for(int j = 1; j <= N; j++) {
                if(j >= i) {
                    waysCount[j] = waysCount[j] + waysCount[j - i];
                }
            }
        }

        return waysCount[N];
    }
    public static void main(String[] args) {
        int N = 8, K = 2;
        int count = numberOfWays(N, K);

        System.out.println("Count: " + count);
    }
}
