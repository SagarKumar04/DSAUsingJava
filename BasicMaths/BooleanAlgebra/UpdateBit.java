package InfinityJune21.BasicMaths.BooleanAlgebra;

public class UpdateBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int value = 1;

        int ans1 = ~(1 << pos);
        n = n & ans1;
        int ans = (n | (value << pos)); //0111
        System.out.println(ans);
    }
}
