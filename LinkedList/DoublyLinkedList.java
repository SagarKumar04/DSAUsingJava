package InfinityJune21.LinkedList;

public class DoublyLinkedList {
    Node head;
    int size;

    class Node {
        Node prev;
        int data;
        Node next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    public void traverse() {
        if(head == null) {
            System.out.println("The linked list is empty");
        }
        else {
            Node currentNode = head;
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public void push(int data) {
        Node n = new Node(data);
        n.next = head;
        if(head != null) {
            head.prev = n;
        }
        head = n;

        size = size + 1;
    }

    public void append(int data) {
        Node n = new Node(data);

        if(head == null) {
            head = n;
        }
        else {
            Node last = head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = n;
            n.prev = last;
        }

        size = size + 1;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.push(10);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.push(20);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.push(30);
        System.out.println("Size: " + dll.size);
        dll.traverse();

        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.append(40);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.append(50);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.append(60);
        System.out.println("Size: " + dll.size);
        dll.traverse();
    }
}
