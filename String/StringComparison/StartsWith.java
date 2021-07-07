package InfinityJune21.String.StringComparison;

public class StartsWith {
    public static void main(String[] args) {
        String s = "Java is a programming language";

        System.out.println(s.startsWith("Java"));
        System.out.println(s.startsWith("is a"));
        System.out.println(s.startsWith("Java is a"));
        System.out.println(s.startsWith("java"));
    }
}
