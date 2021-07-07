package InfinityJune21.String.ModifyingString;

public class ReplaceExample {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumped over the lazy dog and the lazy dog barked";
        String s2 = s1.replace('t', '$');
        System.out.println(s2);
    }
}
