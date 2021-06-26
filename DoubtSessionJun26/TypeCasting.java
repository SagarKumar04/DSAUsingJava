package InfinityJune21.DoubtSessionJun26;

public class TypeCasting {
    public static void main(String[] args) {
        int i1 = 10;
        float f1 = i1; //implicit
        System.out.println("f1: " + f1);

        float f2 = 10.254f;
        int i2 = (int)f2; //explicit
        System.out.println("i2:" + i2);
    }
}
