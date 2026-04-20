package Company;

public class Main {
    static void main(String[] args) {
        Company.companyName = "FireFox";

        Company em1 = new Company(1, "Vitaliy");
        Company em2 = new Company(2, "Igor");

        em1.printCompanyName();
        em2.printCompanyName();

        Company.companyName = "Google";

        em1.printCompanyName();
        em2.printCompanyName();

    }
}
