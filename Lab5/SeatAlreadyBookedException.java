import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    boolean seats[] = new boolean[5];

    void reserveSeat(int seatNo)
            throws SeatAlreadyBookedException {

        if (seatNo < 1 || seatNo > 5) {
            throw new IllegalArgumentException("Invalid Seat Number");
        }

        if (seats[seatNo - 1]) {
            throw new SeatAlreadyBookedException("Seat Already Booked");
        }

        seats[seatNo - 1] = true;

        System.out.println("Seat " + seatNo + " Reserved Successfully");
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        int choice;

        do {
            try {
                System.out.print("\nEnter Seat Number (1-5): ");
                int seatNo = sc.nextInt();

                r.reserveSeat(seatNo);
            }

            catch (SeatAlreadyBookedException e) {
                System.out.println(e.getMessage());
            }

            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            catch (java.util.InputMismatchException e) {
                System.out.println("Incorrect Input! Enter a valid integer.");
                sc.nextLine();
            }

            finally {
                System.out.println("Transaction Completed");
            }

            System.out.print("\nDo you want to reserve another seat? (1-Yes / 0-No): ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("\nName: Kriti Basavaraj Halgali");
        System.out.println("USN: 1WN25CS113");

        sc.close();
    }
}
