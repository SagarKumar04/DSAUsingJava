package InfinityJune21.Trees;

public class InsertionAndTraversal {
    static Node root;
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static void inorderTraversal(Node temp) {
        if(temp == null) {

        }
        else {
            inorderTraversal(temp.left);
            System.out.println(temp.key + " ");
            inorderTraversal(temp.right);
        }
    }

    public static void main(String[] args) {
        //First node
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        inorderTraversal(root);
    }
}
