import transaction.Account;
import reports.Report;

class Main {
    public static void main(String[] args) {

        Account a = new Account(101, 5000);

        System.out.println("Initial Balance: " + a.getBalance());

        a.deposit(2000);

        a.withdraw(1000);

        Report r = new Report(a);
        r.display();

        System.out.println("\nName: Kriti Basavaraj Halgali");
        System.out.println("USN: 1WN25CS113");
       }
}
