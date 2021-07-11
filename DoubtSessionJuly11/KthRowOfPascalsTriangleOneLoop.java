package InfinityJune21.DoubtSessionJuly11;

//Not passing all the test cases
public class KthRowOfPascalsTriangleOneLoop {
    public static void main(String[] args) {
        int n = 6;

        //currentTerm = ((previousTerm) * (n - r + 1)) / i
        int previousTerm = 1;
        System.out.println(previousTerm);
        for(int i = 1; i < n; i++) {
            int currentTerm = (previousTerm * (n - i + 1)) / i;
            System.out.println(currentTerm);
            previousTerm = currentTerm;
        }
        System.out.println("1");
    }
}
