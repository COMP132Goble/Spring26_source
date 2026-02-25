package Inheritance;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void getDetails() {
        System.out.print(name);
    }
}
