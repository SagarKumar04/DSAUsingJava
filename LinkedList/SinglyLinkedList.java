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
        /*
        Allocate the node
        Put the data in the data
        Set next as 'null'
        */
        Node n = new Node(data);

        //If the current node is note the first node of the linked list
        if(head != null) {
            n.next = head;
        }
        //Make current node as the first node of the linked list
        head = n;

        //Increase the size value by 1
        size = size + 1;
    }

    public void insertAtPosition(int position, int data) {
        if(position <= 0 || position > (size + 1)) {
            System.out.println("You may insert between (and including) positions 1 and " + (size + 1));
        }
        else {
            //If position is 1, it is same as 'push' function
            if(position == 1) {
                push(data);
            }
            //If position is size + 1, it is same as 'append' function
            else if(position == (size + 1)) {
                append(data);
            }
            else {
                /*
                Allocate the node
                Put the data in the data
                Set next as 'null'
                */
                Node n = new Node(data);

                //To store the current position of the node while traversing
                int currentPosition = 1;

                //To point to the previous node of the node where the new node is to be inserted
                Node previousNode = head;

                //To traverse through the linked list to reach the required position
                while(currentPosition != (position - 1)) {
                    previousNode.next = previousNode;
                    currentPosition = currentPosition + 1;
                }

                //Make new node point to the next node
                n.next = previousNode.next;

                //Make previous node point to the new node
                previousNode.next = n;

                //Increase the size value by 1
                size = size + 1;
            }
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

        //Increase the size value by 1
        size = size + 1;
    }

    public void delete(int position) {
        if(head == null) {
            System.out.println("Linked List is empty");
        }
        else if(position < 1 || position > size) {
            System.out.println("You can delete between positions 1 and " + size);
        }
        else {
            Node temp = head;
            if(position == 1) {
                head = temp.next;
                temp.next = null;
            }
            else {
                for(int i = 1; i < position - 1; i++) {
                    temp = temp.next;
                }
                Node dN = temp.next;
                temp.next = dN.next;
                dN.next = null;
            }

            size = size - 1;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.traverse();
        System.out.println("Size: " + sll.size);

        sll.push(0);
        sll.traverse();
        System.out.println("Size: " + sll.size);

        sll.append(6);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.append(9);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.append(12);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.append(15);
        sll.traverse();
        System.out.println("Size: " + sll.size);

        sll.push(3);
        sll.traverse();
        System.out.println("Size: " + sll.size);

        sll.insertAtPosition(-1, 18);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.insertAtPosition(7, 21);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.insertAtPosition(9, 24);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.insertAtPosition(8, 24);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.insertAtPosition(9, 27);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.insertAtPosition(1, 30);
        sll.traverse();
        System.out.println("Size: " + sll.size);

        sll.delete(0);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.delete(1);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.delete(9);
        sll.traverse();
        System.out.println("Size: " + sll.size);
        sll.delete(5);
        sll.traverse();
        System.out.println("Size: " + sll.size);
    }
}
