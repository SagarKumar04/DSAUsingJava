package InfinityJune21.String.StringComparison;

public class EndsWith {
    public static void main(String[] args) {
        String s = "Java is a programming language";

        System.out.println(s.endsWith("Java"));
        System.out.println(s.endsWith("guage"));
        System.out.println(s.endsWith("mming language"));
        System.out.println(s.endsWith("programming"));
        System.out.println(s.endsWith("Language"));
    }
}
