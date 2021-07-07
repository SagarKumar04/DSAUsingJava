package InfinityJune21.String.StringComparison;

public class EqualsFunctionVsEqualOperator {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcdef";
        String s3 = new String(s1);

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
    }
}
