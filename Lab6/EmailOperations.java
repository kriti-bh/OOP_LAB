
import java.util.Scanner;

class EmailOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student email address: ");
        String email = sc.nextLine();
        
        System.out.println("Length: " + email.length());

        int pos = email.indexOf('@');

        if (pos != -1) {
            String username = email.substring(0, pos);
            System.out.println("Username: " + username);

            String domain = email.substring(pos + 1);
            System.out.println("Domain: " + domain);

            if (domain.equals("bmsce.ac.in"))
                System.out.println("Valid BMSCE Email");
            else
                System.out.println("Not a BMSCE Email");
        } else {
            System.out.println("Invalid Email Format");
        }

        String lower = email.toLowerCase();
        System.out.println("Lowercase Email: " + lower);

        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix))
            System.out.println("Email starts with the given prefix");
        else
            System.out.println("Email does not start with the given prefix");

        if (email.endsWith("bmsce.ac.in"))
            System.out.println("Email ends with valid domain");
        else
            System.out.println("Email does not end with valid domain");

        String updated = email.replace("bmsce.ac.in", "cse.bmsce.ac.in");
        System.out.println("Updated Email: " + updated);

        System.out.print("Enter sequence to search: ");
        String seq = sc.nextLine();

        if (email.contains(seq))
            System.out.println("Email contains the given sequence");
        else
            System.out.println("Email does not contain the given sequence");

        String trimmed = email.trim();
        System.out.println("Trimmed Email: " + trimmed);

        System.out.print("Enter another email address: ");
        String email2 = sc.nextLine();

        if (email.equalsIgnoreCase(email2))
            System.out.println("Both email addresses are identical");
        else
            System.out.println("Email addresses are different");

        System.out.println("\nName: Kriti Basavaraj Halgali");
        System.out.println("USN: 1WN25CS113");

        sc.close();
    }
}
