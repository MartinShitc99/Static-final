package University;

public class Main {
    static void main(String[] args) {
        University st = new University(1, "Ivan");
        University st1 = new University(2, "Darya");
        University st2 = new University(3, "Yana");

        University.universityName = "МГУ";

        st.printStudentInfo();
        st1.printStudentInfo();
        st2.printStudentInfo();

        University.universityName = "ЯГПУ";

        st.printStudentInfo();
        st1.printStudentInfo();
        st2.printStudentInfo();
    }
}
