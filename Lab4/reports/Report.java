package reports;

import transaction.Account;

public class Report {
    Account a;

    public Report(Account a) {
        this.a = a;
    }

    public void display() {
        System.out.println("\n--- Transaction Report ---");
        System.out.println("Account Number: " + a.getAccountNumber());
        System.out.println("Current Balance: " + a.getBalance());
    }
}
