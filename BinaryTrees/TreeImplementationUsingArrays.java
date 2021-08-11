package InfinityJune21.BinaryTrees;

public class TreeImplementationUsingArrays {
    static String tree[] = new String[10];
    static int root = 0;
    static int lastIndex = 0;

    static void setLeft(String key, int parent) {
        int index = (parent * 2) + 1;
        tree[index] = key;
        lastIndex++;
    }

    static void setRight(String key, int parent) {
        int index = (parent * 2) + 2;
        tree[index] = key;
        lastIndex++;
    }

    static void traverse() {
        for(int i = 0; i <= lastIndex; i++) {
            System.out.print(tree[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        tree[root] = "A";
        setLeft("B", 0);
        setRight("C", 0);
        setLeft("D", 1);
        setRight("E", 1);
        setLeft("F", 2);
        setRight("G", 2);

        traverse();
    }
}
