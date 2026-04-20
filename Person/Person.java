package Person;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String someFirstName, String someLastName, String someSsn) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    public String getSsn() {
        return ssn;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void printPersonInfo(){
        System.out.println("First name: " + this.firstName + "; Last name: " + this.lastName + "; SSN: " + this.ssn);
    }
}
