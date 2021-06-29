package InfinityJune21.BasicMaths.BooleanAlgebra;

public class ClearBit {
    public static void main(String[] args) {
        int n = 9; //1001
        int pos = 0;

        int ans1 = 1 << pos;
        int ans2 = ~ans1;
        int ans = n & ans2; //1000 = 8

        System.out.println(ans);
    }
}
