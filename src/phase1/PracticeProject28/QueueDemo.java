//Write a program in Java to insert and remove elements in a queue
package phase1.PracticeProject28;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Inserting elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        // Displaying the queue after insertion
        System.out.println("Queue after insertion: " + queue);

        // Removing an element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Displaying the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peeking at the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front element of the queue: " + frontElement);
    }
}

