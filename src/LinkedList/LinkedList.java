package LinkedList;

public class LinkedList<T> {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public T getFirst() {
        return (T) this.first.getData();
    }

    public T getLast() {
        return (T) this.last.getData();
    }

    public int getSize() {
        return this.size;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public void push(T item) {
        Node newNode = new Node<T>(item);
        if (this.isEmpty()) {
            this.last = newNode;
        } else {
            newNode.setNext(this.first);
        }
        this.first = newNode;
        this.size++;
    }

    public void pushLast(T item) {
        Node newNode = new Node<T>(item);
        if (this.isEmpty()) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
        this.size++;
    }

    public T pop() {
        Node temp = this.first;
        T data = (T) temp.getData();
        this.first = this.first.getNext();
        if (this.isEmpty()) {
            this.last = null;
        }
        return data;
    }
}

