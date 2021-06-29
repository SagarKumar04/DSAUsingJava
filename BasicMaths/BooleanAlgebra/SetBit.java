package InfinityJune21.BasicMaths.BooleanAlgebra;

public class SetBit {
    public static void main(String[] args) {
        int n = 50; //110010
        int pos = 2;

        int ans1 = 1 << pos;
        int ans = n | ans1; //110110 = 54

        System.out.println(ans);
    }
}
