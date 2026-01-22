package ObjectsAndClasses;

public class Door {
    private String status;

    public Door(String status) {
        this.status = status;
    }

    public void close() {
        System.out.println("Closing Door");
        status = "closed";
    }

    public void open() {
        System.out.println("Opening Door");
        status = "opened";
    }

    public void knock() {
        System.out.println("Knock knock");
    }

    public void changeStatus() {
        if (status == "opened")
            close();
        else
            open();
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        // the status parameter needs to be either "opened" or "closed"
        Door classroom = new Door("opened");
        String status = classroom.getStatus();
        
        if (status == "closed") {
            classroom.knock();
            classroom.open();
        } else {
            System.out.println("The door is open, come in!");
        }
    }
}
