package InfinityJune21.LinkedList;

public class CircularLinkedList {
    Node head;
    int size;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int data) {
        Node n = new Node(data);

        if(head != null) {
            n.next = head;
            head.next = n;
            head = n;
        }
        else {
            head = n.next = n;
        }

        size = size + 1;
    }

    public void traverse() {
        if(head == null) {
            System.out.println("The linked list is empty");
        }
        else {
            Node currentNode = head;

            do {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            while(currentNode != head);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.traverse();
        cll.push(10);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.push(20);
        System.out.println("Size: " + cll.size);
        cll.traverse();
    }
}
