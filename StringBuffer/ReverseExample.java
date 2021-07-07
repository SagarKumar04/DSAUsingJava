package InfinityJune21.StringBuffer;

public class ReverseExample {
    public static void main(String[] args) {
        StringBuffer originalString = new StringBuffer("nitin");
        StringBuffer reversedString = new StringBuffer(originalString);
        reversedString = reversedString.reverse();

        System.out.println(originalString);
        System.out.println(reversedString);

        String original = originalString.toString();
        String reversed = reversedString.toString();

        boolean isEqual = original.equals(reversed);

        System.out.println(isEqual);
    }
}
