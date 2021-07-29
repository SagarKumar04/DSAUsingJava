package InfinityJune21.LinkedList;

import java.util.LinkedList;

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
            Node temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }

            n.next = head;
            head = n;
            temp.next = n;
        }
        else {
            head = n.next = n;
        }

        size = size + 1;
    }

    public void insertAtPosition(int position, int data) {
        if (position <= 0 || position > (size + 1)) {
            System.out.println("You may insert between (and including) positions 1 and " + (size + 1));
        }
        else {
            if (position == 1) {
                push(data);
            }
            else if (position == (size + 1)) {
                append(data);
            }
            else {
                Node n = new Node(data);

                int currentPosition = 1;

                Node previousNode = head;

                while(currentPosition != (position - 1)) {
                    previousNode = previousNode.next;
                    currentPosition = currentPosition + 1;
                }

                n.next = previousNode.next;

                previousNode.next = n;

                size = size + 1;
            }
        }
    }

    public void append(int data) {
        Node n = new Node(data);

        if(head != null) {
            Node temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }

            temp.next = n;
            n.next = head;
        }
        else {
            head = n;
            n.next = n;
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

    public void delete(int position) {
        if(head == null) {
            System.out.println("The linked list is empty");
        }
        else if(position < 1 || position > size) {
            System.out.println("You can delete between positions 1 and " + size);
        }
        else {
            if(position == 1) {
                Node dN = head;
                Node temp = head;
                while(temp.next != head) {
                    temp = temp.next;
                }

                head = dN.next;
                temp.next = head;
                dN.next = null;
            }
            else if(position == size) {
                Node cN = head;
                for(int currentPosition = 1; currentPosition < position - 1; currentPosition++) {
                    cN = cN.next;
                }

                Node dN = cN.next;

                cN.next = head;
                dN.next = null;
            }
            else {
                Node cN = head;
                for(int currentPosition = 1; currentPosition < position - 1; currentPosition++) {
                    cN = cN.next;
                }

                Node dN = cN.next;

                cN.next = dN.next;
                dN.next = null;
            }

            size = size - 1;
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

        cll.append(30);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.append(40);
        System.out.println("Size: " + cll.size);
        cll.traverse();

        cll.insertAtPosition(1,50);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.insertAtPosition(6, 60);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.insertAtPosition(4, 70);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.insertAtPosition(2, 80);
        System.out.println("Size: " + cll.size);
        cll.traverse();

        cll.delete(0);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(1);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(8);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(1);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(6);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(5);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(3);
        System.out.println("Size: " + cll.size);
        cll.traverse();
        cll.delete(2);
        System.out.println("Size: " + cll.size);
        cll.traverse();
    }
}
