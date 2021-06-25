package InfinityJune21.BasicMaths.Modulo;

public class IntegerOverflow {
    public static void main(String[] args) {
        int minNum = Integer.MIN_VALUE;
        int maxNum = Integer.MAX_VALUE;
        System.out.println("Min Num: " + minNum);
        System.out.println("Max Num: " + maxNum);

        int a = maxNum + 1;
        System.out.println("a: " + a);
    }
}
