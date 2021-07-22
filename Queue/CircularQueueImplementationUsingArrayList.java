package InfinityJune21.Queue;

import java.util.ArrayList;

public class CircularQueueImplementationUsingArrayList {
    int size, front, rear;
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    CircularQueueImplementationUsingArrayList(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    //inserting an element in the queue
    public void enqueue(int data) {
        //queue is full
        if(((front == 0) && (rear == size - 1))
            || (rear == (front - 1 % (size - 1)))) {
            System.out.println("Queue is full");
        }
        //queue is empty
        else if(front == -1) {
            front = rear = 0;
            queue.add(rear, data);
        }
        else if((rear == size - 1) && (front != 0)) {
            rear = 0;
            queue.set(rear, data);
        }
        else {
            rear = rear + 1;

            if(front <= rear) {
                queue.add(rear, data);
            }
            else {
                queue.set(rear, data);
            }
        }
    }

    public void dequeue() {
        int element;

        if(front == -1) {
            System.out.println("Queue is empty");
        }
        else {
            element = queue.get(front);

            //only one element in the queue
            if(front == rear) {
                front = rear = -1;
            }
            else if(front == size - 1) {
                front = 0;
            }
            else {
                front = front + 1;
            }

            System.out.println("Deleted element: " + element);
        }
    }

    public void traverse() {
        if(front == -1) {
            System.out.println("Queue is empty");
        }
        else {
            if(rear >= front) {
                for(int i = front; i <= rear; i++) {
                    System.out.print(queue.get(i) + " ");
                }
                System.out.println();
            }
            else {
                for(int i = front; i < size; i++) {
                    System.out.print(queue.get(i) + " ");
                }
                for(int i = 0; i <= rear; i++) {
                    System.out.print(queue.get(i) + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Queue currently: " + queue);
    }

    public static void main(String[] args) {
        CircularQueueImplementationUsingArrayList cq = new CircularQueueImplementationUsingArrayList(5);

        cq.enqueue(14);
        cq.traverse();
        cq.enqueue(21);
        cq.traverse();
        cq.enqueue(7);
        cq.traverse();
        cq.enqueue(28);
        cq.traverse();
        cq.dequeue();
        cq.traverse();
        cq.dequeue();
        cq.traverse();
        cq.enqueue(35);
        cq.traverse();
        cq.enqueue(42);
        cq.traverse();
    }
}
