package InfinityJune21.String.CharacterExtraction;

public class CharacterExtractionUsingToCharArray {
    public static void main(String[] args) {
        String s = "Java is a programming language";
        int length = s.length();
        char sArr[] = new char[length];

        sArr = s.toCharArray();

        for(int i = 0; i < length; i++) {
            System.out.print(sArr[i] + ", ");
        }
    }
}
