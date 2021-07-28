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
                int currentPosition = 1;

                Node previousNode = head;

                while(currentPosition != (position - 1)) {
                    previousNode = previousNode.next;
                    currentPosition = currentPosition + 1;
                }

                Node n = new Node(data);

                n.prev = previousNode;
                n.next = previousNode.next;
                previousNode.next.prev = n;
                previousNode.next = n;

                size = size + 1;
            }
        }
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

    public void delete(int position) {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        else if (position < 1 || position > size) {
            System.out.println("You can delete between positions 1 and " + size);
        }
        else {
            Node temp = head;
            if(position == 1) {
                temp.next.prev = null;
                head = temp.next;
                temp.next = null;
            }
            else {
                //iterate and reach the position
                int currentPosition = 1;
                for(int i = 1; i < position - 1; i++) {
                    temp = temp.next;
                }

                Node dN = temp.next;
                if(position == size) {
                    temp.next = dN.prev = null;
                }
                else {
                    temp.next = dN.next;
                    temp.next.prev = temp;
                    dN.next = dN.prev = null;
                }
            }

            size = size - 1;
        }
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

        dll.insertAtPosition(0, 70);
        System.out.println("Size: " + dll.size);
        dll.traverse();

        dll.insertAtPosition(8, 80);
        System.out.println("Size: " + dll.size);
        dll.traverse();

        dll.insertAtPosition(1, 90);
        System.out.println("Size: " + dll.size);
        dll.traverse();

        dll.insertAtPosition(8, 100);
        System.out.println("Size: " + dll.size);
        dll.traverse();

        dll.insertAtPosition(5, 110);
        System.out.println("Size: " + dll.size);
        dll.traverse();

        dll.delete(0);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(10);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(1);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(1);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(7);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(6);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(2);
        System.out.println("Size: " + dll.size);
        dll.traverse();
        dll.delete(3);
        System.out.println("Size: " + dll.size);
        dll.traverse();
    }
}
