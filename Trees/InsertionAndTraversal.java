package InfinityJune21.Trees;

import java.util.LinkedList;
import java.util.Queue;

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

    static void insert(int key) {
        Node node = new Node(key);

        if(root == null) {
            root = node;
        }
        else {
            Node temp = root;

            Queue<Node> queue = new LinkedList<Node>();
            queue.add(temp);

            while(!queue.isEmpty()) {
                temp = queue.poll();

                if(temp.left == null) {
                    temp.left = node;
                    break;
                }
                else {
                    queue.add(temp.left);
                }

                if(temp.right == null) {
                    temp.right = node;
                    break;
                }
                else {
                    queue.add(temp.right);
                }
            }
        }
    }

    static void inorderTraversal(Node temp) {
        if(root == null) {
            System.out.println("Tree is empty");
        }
        else if(temp == null) {

        }
        else {
            inorderTraversal(temp.left);
            System.out.print(temp.key + " ");
            inorderTraversal(temp.right);
        }
    }

    static void preorderTraversal(Node temp) {
        if(root == null) {
            System.out.println("Tree is empty");
        }
        else if(temp == null) {

        }
        else {
            System.out.print(temp.key + " ");
            preorderTraversal(temp.left);
            preorderTraversal(temp.right);
        }
    }

    static void postorderTraversal(Node temp) {
        if(root == null) {
            System.out.println("Tree is empty");
        }
        else if(temp == null) {

        }
        else {
            postorderTraversal(temp.left);
            postorderTraversal(temp.right);
            System.out.print(temp.key + " ");
        }
    }

    static void levelOrderTraversal() {
        if(root == null) {
            System.out.println("Tree is empty");
        }
        else {
            Node temp = root;

            Queue<Node> queue = new LinkedList<Node>();
            queue.add(temp);
            while(!queue.isEmpty()) {
                temp = queue.poll();
                System.out.print(temp.key + " ");

                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        //First node
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);

        System.out.println("Level Order: ");
        levelOrderTraversal();
        System.out.println();

        System.out.println("Preorder: ");
        preorderTraversal(root);
        System.out.println();

        System.out.println("Inorder: ");
        inorderTraversal(root);
        System.out.println();

        System.out.println("Postorder: ");
        postorderTraversal(root);
        System.out.println();
    }
}
