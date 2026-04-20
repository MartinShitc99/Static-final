package University;

public class University {
    static String universityName;
    String studentName;
    final int studentID;

    University(int someID, String someStudentName) {
        this.studentID = someID;
        this.studentName = someStudentName;
    }

    public static String changeUniversityName(String newName) {
        return universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("University name: " + universityName + "; Student Name: " + this.studentName + "; Student ID: " + this.studentID);
    }
}
