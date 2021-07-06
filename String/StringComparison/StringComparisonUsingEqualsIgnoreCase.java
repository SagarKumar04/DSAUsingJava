package InfinityJune21.String.StringComparison;

public class StringComparisonUsingEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "JavascriPt";
        String s2 = "javasCript";

        boolean isSame = s1.equalsIgnoreCase(s2);

        System.out.println(isSame);
    }
}
