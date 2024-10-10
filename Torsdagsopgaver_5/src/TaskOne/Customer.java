package TaskOne;
// 1.a
public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    // 1.b
    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        counter++;
        id = counter;

    }
    // 1.d
    @Override
    public String toString() {
        return firstName + " " + lastName + " : Username = " + userName + " : id =  " + id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public void setLastName(String newName) {
        this.lastName = newName;
    }

    public void setUserName(String newName) {
        this.userName = newName;
    }
}
