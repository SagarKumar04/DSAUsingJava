package InfinityJune21.LoopsExamples.ForExamples;

public class ForExample3 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);

            if(i >= 8) {
                i = 10;
            }
        }
    }
}
