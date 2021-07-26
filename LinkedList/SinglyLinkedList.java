package InfinityJune21.LinkedList;

public class SinglyLinkedList {
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

        if(head != null) {
            n.next = head;
        }
        head = n;

        size = size + 1;
    }

    public void insertAtPosition(int position, int data) {
        if(position < 0 || position > (size + 1)) {
            System.out.println("You may insert between (and including) positions 0 and " + (size + 1));
        }
        else {
            System.out.println("Fine!");
        }
    }

    public void append(int data) {
        /*
        Allocate the node
        Put the data in the data
        Set next as 'null'
        */
        Node n = new Node(data);

        //If the linked list is empty, make new node as head
        if(head == null) {
            head = n;
        }
        /*
        If the linked list is not empty, the new node will be the
        last node. So, make 'next' of the new node as 'null'
        Traverse till the last node
         */
        else {
            //Traverse till the end of the existing linked list
            Node last = head;
            while(last.next != null) {
                last = last.next;
            }

            //Change the 'next' of the previous last node
            last.next = n;
        }

        size = size + 1;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.traverse();

        sll.push(0);
        sll.traverse();

        sll.append(6);
        sll.traverse();
        sll.append(9);
        sll.traverse();
        sll.append(12);
        sll.traverse();
        sll.append(15);
        sll.traverse();

        sll.push(3);
        sll.traverse();

        System.out.println("Size: " + sll.size);
        sll.insertAtPosition(-1, 18);
        sll.insertAtPosition(7, 21);
        sll.insertAtPosition(8, 21);
    }
}
