package InfinityJune21.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementationUsingQueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int removedElement;

        System.out.println("Size of queue: " + queue.size());

        for(int i = 0; i < 5; i++) {
            queue.add(i);
        }

        System.out.println("Elements inside queue: " + queue);
        System.out.println("Size of queue: " + queue.size());

        removedElement = queue.remove();
        System.out.println("Element removed: " + removedElement);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Elements inside queue: " + queue);
    }
}
