package InfinityJune21.Queue;

public class QueueImplementationUsingArray {
    private int maxSize;
    private int queueArray[];
    private int front;
    private int rear;

    QueueImplementationUsingArray(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = rear = -1;
    }

    boolean isFull() {
        return (rear == maxSize - 1);
    }

    boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    void insert(int element) {
        System.out.println("Inserting " + element + "...");
        if(isFull()) {
            System.out.println("Cannot insert. Queue is full");
        }
        else {
            if(front == -1 && rear == -1) {
                front = rear = 0;
            }
            else {
                rear = rear + 1;
            }

            queueArray[rear] = element;
            System.out.println("Successfully inserted " + element + "...");
        }
    }

    void delete() {
        System.out.println("Deleting...");
        if(isEmpty()) {
            System.out.println("Cannot delete. Queue is empty");
        }
        else {
            int element = queueArray[front];
            System.out.println("Deleted " + element + "...");
            front = front + 1;
        }
    }

    void traverse() {
        System.out.println("Traversing the queue...");
        if(isEmpty()) {
            System.out.println("Cannot traverse. Queue is empty");
        }
        else {
            System.out.println("Elements in the queue are: ");
            for(int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueImplementationUsingArray q = new QueueImplementationUsingArray(7);

        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);

        q.traverse();

        q.delete();
        q.delete();

        q.traverse();

        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);

        q.traverse();

        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();

        q.traverse();

        q.insert(100);
    }
}
