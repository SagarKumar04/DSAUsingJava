package InfinityJune21.BasicMaths.PrimeNumbers;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int n = 1000001;
        int squareRoot = (int)Math.sqrt(n);
        int count = 0;

        long startTime = System.nanoTime();
        for(int i = 2; i <= squareRoot; i++) {
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
