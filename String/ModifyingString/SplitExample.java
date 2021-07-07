package InfinityJune21.String.ModifyingString;

public class SplitExample {
    public static void main(String[] args) {
        String s = "Java is an interesting and a useful language";

        String sArr[] = s.split(" ");
        for(String s1 : sArr) {
            System.out.println(s1);
        }
    }
}
