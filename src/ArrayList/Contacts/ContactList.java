package ArrayList.Contacts;

import java.util.ArrayList;

public class ContactList {
    // Person person1 = new Person("Anna", "anna@example.edu", "5555555", "01/01/06");
    // Person person2 = new Person("Anna", "anna@example.edu", "5555555", "01/01/06");
    // Person person3 = new Person("Anna", "anna@example.edu", "5555555", "01/01/06");
    // Person person4 = new Person("Anna", "anna@example.edu", "5555555", "01/01/06");
    // Person person5 = new Person("Anna", "anna@example.edu", "5555555", "01/01/06");
    // private ArrayList contacts = new ArrayList<Person>();
    private ArrayList contacts;

    public ContactList() {
        contacts = new ArrayList<Person>();
    }

    public void add(Person human) {
        contacts.add(human);
    }
}
