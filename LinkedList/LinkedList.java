package linkedlist;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public void push(T item) {
        Node newNode = new Node(item);
        if (this.isEmpty()) {
            this.last = newNode;
        } else {
            newNode.setNext(this.first);
        }
        this.first = newNode;
    }

    public void pushLast(T item) {
        Node newNode = new Node(item);
        
    }
}

class Node<T> {

    private T data;
    private Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
