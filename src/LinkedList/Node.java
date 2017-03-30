package LinkedList;

public class Node<T> {

    private T data;
    private Node next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    Node getNext() {
        return this.next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
