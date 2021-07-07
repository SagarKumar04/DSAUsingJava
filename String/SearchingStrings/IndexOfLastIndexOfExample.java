package InfinityJune21.String.SearchingStrings;

public class IndexOfLastIndexOfExample {
    public static void main(String[] args) {
        String s = "topic isas for today is a string handling";
        int index = s.indexOf('s');
        int lastIndex = s.lastIndexOf('s');
        System.out.println(index);
        System.out.println(lastIndex);

        index = s.indexOf("is");
        lastIndex = s.lastIndexOf("is");
        System.out.println(index);
        System.out.println(lastIndex);

        index = s.indexOf("the");
        lastIndex = s.lastIndexOf("the");
        System.out.println(index);
        System.out.println(lastIndex);

        index = s.indexOf('s', 13);
        lastIndex = s.lastIndexOf('s', 13);
        System.out.println(index);
        System.out.println(lastIndex);
    }
}
