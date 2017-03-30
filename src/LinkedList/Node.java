package LinkedList;

public class Node {

    private String data;
    private Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }

    String getData() {
        return this.data;
    }

    Node getNext() {
        return this.next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
