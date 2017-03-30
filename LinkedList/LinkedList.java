public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Object getFirst() {
        return this.first;
    }

    public int getSize() {
        return this.size;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public void push(Object item) {
        Node newNode = new Node(item);
        if (this.isEmpty()) {
            this.last = newNode;
        } else {
            newNode.setNext(this.first);
        }
        this.first = newNode;
        this.size++;
    }

    public void pushLast(Object item) {
        Node newNode = new Node(item);
        if (this.isEmpty()) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
        this.size++;
    }

    public Object pop() {
        Node temp = this.first;
        Object data = temp.getData();
        this.first = this.first.getNext();
        if (this.isEmpty()) {
            this.last = null;
        }
        return data;
    }
}

class Node<Object> {

    private Object data;
    private Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
