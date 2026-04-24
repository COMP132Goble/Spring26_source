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

        /*
            Let's just populate a list of random characters
        */
        char val = 'A';
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 1){
                val++;
                continue;
            }
            String value = String.valueOf(val);
            val++;
            myList.add(value);
            System.out.println(myList);
        }
        myList.add(1, "B");

        System.out.println(myList);

        // int index = 3;
        // String value = myList.get(index);

        // System.out.println("The value at index " 
        //     + index + " is " + value
        // );
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

    /** 
     * Notice that for the add method for the List ADT we are just using the 
     * addBack method, so by default the List data structure adds things to 
     * the end.
     * */
    public void add(String value) {
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

    /**
     * Now we want the ability to insert a node at a particular index.
     * First we want to verify that we were given a valid index, then 
     * we will want to traverse the list until we are right before the index we 
     * want our value at. This is because when we add the element it will be placed 
     * at the desired index.
     *
     * @param index where we would like our new value to be placed
     * @param value the string that we want stored in our list.
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, String value) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("tried to set " 
                    + index + " but size is " + size + ".");
        } 

        if(index == 0) {
            addFront(value);
        } else {
            Node newNode = new Node(value);
            Node previous = head;
            /*
            Starting at the head, we will traverse until we are at the node that
            points to the desired index.
            */
            for(int i = 0; i < index-1; i++) {
                previous = previous.next;
            }

            newNode.next = previous.next;
            previous.next = newNode;
            size++;
        }
    }
    
    public String get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                "tried to access index " + index + " but the size" 
                + " is " + size 
            );
        }

        return "";
    }

    public void set(int index, String value) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                "tried to access index " + index + " but the size" 
                + " is " + size 
            );
        }
    }

    public String remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                "tried to access index " + index + " but the size" 
                + " is " + size 
            );
        }
        return "";
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
