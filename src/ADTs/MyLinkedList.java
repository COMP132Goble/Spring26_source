package ADTs;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        // myList.add("A");
        // myList.add("B");
        // myList.add("C");

        System.out.println(myList);
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