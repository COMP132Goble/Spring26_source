package ADTs;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        System.out.println(myList);
        myList.addFront("A");
        System.out.println(myList);
        myList.addFront("B");
        System.out.println(myList);
        myList.addFront("C");

        System.out.println(myList);
    }

    public void addFront(String value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addBack(String value) {
        Node newNode = new Node(value);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("head -> ");
        if (isEmpty())
            return builder.append("null").toString();
        builder.append("[");
        Node current = head;
        while(current != null) {
            builder.append(current.data);
            if (current.next != null) {
                builder.append("] -> [");
            }
            current = current.next;
        }
        return builder.append("] -> null").toString();
    }

    public static class Node {
        String data;
        Node next;

        public Node(String value) {
            this.data = value;
            this.next = null;
        }
    }
}