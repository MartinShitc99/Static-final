package Company;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void printCompanyName(){
        System.out.println("Company Name: " + companyName);
    }
}
