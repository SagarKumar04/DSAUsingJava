package InfinityJune21.String.CharacterExtraction;

public class CharacterExtractionUsingCharAt {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog.";

        int n = 9;

        //Extracts a single character
        char nthCharacter = s.charAt(n);
        System.out.println("Char at position " + n + " is: " + nthCharacter);

        //To extract more than one character
        int startIndex = 9;
        int endIndex = 13;
        String extractedChars = "";

        for(int i = startIndex; i < endIndex; i++) {
            char ch = s.charAt(i);
            extractedChars = extractedChars + ch;
        }
        System.out.println("Extracted characters as a String: " + extractedChars);
    }
}
