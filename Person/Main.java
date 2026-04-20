package Person;

public class Main {
    static void main(String[] args) {
        Person ps1 = new Person("Ivan", "Ivanov", "111-11-11");
        Person ps2 = new Person("Darya", "Ivanova", "121-12-11");

        ps2.printPersonInfo();

        ps2.setFirstName("Daryanova");

        ps2.printPersonInfo();
    }
}
