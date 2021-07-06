package InfinityJune21.String.CharacterExtraction;

public class PalindromeUsingCharAt {
    public static void main(String[] args) {
        String originalString = "nitino";

        int length = originalString.length();
        boolean isPalindrome = true;

        for(int i = 0; i <= (length / 2); i++) {
            char ch1 = originalString.charAt(i);
            char ch2 = originalString.charAt(length - i - 1);

            if(ch1 != ch2) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
