package InfinityJune21.LoopsExamples.ForExamples;

public class ForExample1 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("------------");
        for(int i = 0; i < 500; i = i + 100) {
            System.out.println(i);
        }
    }
}
