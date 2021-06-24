package InfinityJune21.BasicMaths.PrimeNumbers;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int n = 1000000, count = 0;

        long startTime = System.nanoTime();
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total Time: " + totalTime);

        if(count == 0) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Composite Number");
        }
    }
}
