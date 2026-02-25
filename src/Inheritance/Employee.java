package Inheritance;

public class Employee extends Person {
    private static int ID = 0;
    private int employeeID;
    private String hireDate;
    private String title;
    
    public Employee(String name, String address, String phone, String hire, String title) {
        super(name, address, phone);
        this.employeeID = ID + 1;
        this.hireDate = hire;
        this.title = title;
        ID++;
    }

    public int getID() {
        return employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getTitle() {
        return title;
    }

    public void getDetails() {
        System.out.print("Employee ");
        super.getDetails();
        System.out.println(" has worked since " + hireDate);
    }
}
