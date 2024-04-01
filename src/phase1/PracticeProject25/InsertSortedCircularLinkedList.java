//Write a program in Java to insert a new element in a sorted circular linked list
package phase1.PracticeProject25;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head; // Pointing back to itself for circularity
        } else {
            Node current = head;
            Node prev = null;

            // Traverse the list to find the appropriate position to insert
            do {
                prev = current;
                current = current.next;
            } while (current != head && current.data < data);

            // Insert the new node
            newNode.next = current;
            prev.next = newNode;

            // Update head if necessary
            if (current == head && data < current.data) {
                head = newNode;
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular linked list is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class InsertSortedCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        // Inserting a new element
        int newData = 25;
        System.out.println("\nInserting " + newData + " in sorted order:");
        list.insert(newData);

        System.out.println("\nList after insertion:");
        list.display();
    }
}

