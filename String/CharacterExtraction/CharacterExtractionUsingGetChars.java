package InfinityJune21.String.CharacterExtraction;

public class CharacterExtractionUsingGetChars {
    public static void main(String[] args) {
        String s = "Java is a programming language";
        int sourceStart = 10;
        int sourceEnd = 20;
        char target[] = new char[20];
        int targetStart = 5;

        s.getChars(sourceStart, sourceEnd, target, targetStart);

        for(int i = 0; i < 20; i++) {
            System.out.print(target[i] + ", ");
        }
    }
}
