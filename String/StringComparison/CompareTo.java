package InfinityJune21.String.StringComparison;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Apples";
        System.out.println(s1.compareTo(s2));

        s1 = "Fanta";
        s2 = "Fanza";
        System.out.println(s1.compareTo(s2));

        s1 = "Fanta";
        s2 = "fanta";
        System.out.println(s1.compareTo(s2));

        s1 = "Beautiful";
        s2 = "Beauty";
        System.out.println(s1.compareTo(s2));

    }
}
