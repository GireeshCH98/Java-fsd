//Write a program in Java to traverse a doubly linked list in the forward and backward directions
package phase1.PracticeProject26;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void traverseForward() {
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }

        Node current = head;
        System.out.println("Forward traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        System.out.println("Backward traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(20);
        list.insert(40);

        list.traverseForward();
        list.traverseBackward();
    }
}
