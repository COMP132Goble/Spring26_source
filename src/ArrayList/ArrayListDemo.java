package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    private ArrayList<String> theList;

    public ArrayListDemo() {
        theList = new ArrayList<String>();
    }

    public void operations() {
        String str1 = "First Item";
        String str2 = "Second Item";
        String str3 = "Third Item";

        theList.add("str1");
        theList.add(str2);
        theList.add(str3);

        String str4 = theList.get(0);
        System.out.println("Object at index 0: " + str4);
        System.out.println("The Object at index 1: " + theList.get(1));
        System.out.println("The Object at index 2: " + theList.get(2));
        System.out.println("The Object at index 3: " + theList.get(3));
        // int size = theList.size();
        // System.out.println("The size of the list is: " + size);

        // theList.remove(0);
        // System.out.println("Now the object at index 0 is: " + theList.get(0));
        // System.out.println("Now the size is: " + theList.size());
        // System.out.println("What is str4??? " + str4);
    }
    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        demo.operations();
    }
}
