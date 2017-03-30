package LinkedList;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public String getFirst() {
        return this.first.getData();
    }

    public int getSize() {
        return this.size;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public void push(String item) {
        Node newNode = new Node(item);
        if (this.isEmpty()) {
            this.last = newNode;
        } else {
            newNode.setNext(this.first);
        }
        this.first = newNode;
        this.size++;
    }

    public void pushLast(String item) {
        Node newNode = new Node(item);
        if (this.isEmpty()) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
        this.size++;
    }

    public String pop() {
        Node temp = this.first;
        String data = temp.getData();
        this.first = this.first.getNext();
        if (this.isEmpty()) {
            this.last = null;
        }
        return data;
    }
}

