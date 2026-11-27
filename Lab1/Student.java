
import java.util.Scanner;

class Student {
    String USN;
    String Name;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();
    }

    void display() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + Name);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nEnter details of Student " + (i + 1));
            s[i].accept();
        }

        System.out.println("\n--- Student Details ---");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            s[i].display();
        }

        System.out.println("\nName: Kriti Basavaraj Halgali");
        System.out.println("USN: 1WN25CS113");
    }
}
