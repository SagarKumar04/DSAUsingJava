package InfinityJune21.BinarySearchTrees;

public class Insertion {
    Node root;

    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    void insert(int key) {
        root = insertWrapper(root, key);
    }

    Node insertWrapper(Node root, int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return root;
        }

        if(key < root.key) {
            root.left = insertWrapper(root.left, key);
        }
        else {
            root.right = insertWrapper(root.right, key);
        }

        return root;
    }

    void inorder() {
        inorderWrapper(root);
    }

    void inorderWrapper(Node root) {
        if(root != null) {
            inorderWrapper(root.left);
            System.out.print(root.key + " ");
            inorderWrapper(root.right);
        }
    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();

        insertion.insert(100);
        insertion.insert(110);
        insertion.insert(90);
        insertion.insert(105);
        insertion.insert(95);
        insertion.insert(120);
        insertion.insert(90);

        insertion.inorder();
    }
}
