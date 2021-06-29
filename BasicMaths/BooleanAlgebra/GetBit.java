package InfinityJune21.BasicMaths.BooleanAlgebra;

public class GetBit {
    public static void main(String[] args) {
        int n = 50; //110010
        int pos = 5;

        int ans1 = 1 << pos;
        int ans2 = n & ans1;

        if(ans2 != 0) {
            System.out.println("Bit is 1");
        }
        else {
            System.out.println("Bit is 0");
        }
    }
}
