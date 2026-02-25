package ArrayList.Contacts;

public class Person {
    private String name;
    private String email;
    private String phone;
    private String birthDay;

    public Person(String name, String email, String phone, String birthDay) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
