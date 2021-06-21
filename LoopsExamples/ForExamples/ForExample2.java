package InfinityJune21.LoopsExamples.ForExamples;

public class ForExample2 {
    public static void main(String[] args) {
        int i = 0;
        for(; ;) {
            if (i < 5) {
                System.out.println(i);
            }
            else {
                break;
            }
            i++;
        }
    }
}
