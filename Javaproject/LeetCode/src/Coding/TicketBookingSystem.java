package Coding;
import java.util.Scanner;

class TicketBookingSystem {
    private static int totalSeats = 50;
    private static boolean[] seatAvailability = new boolean[totalSeats];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Ticket Booking System");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAvailableSeats();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 3:
                    System.out.println("Thank you for using the Ticket Booking System. Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void viewAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        for (int i = 0; i < totalSeats; i++) {
            System.out.print((seatAvailability[i] ? "X" : "O") + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void bookTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the seat number you want to book: ");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > totalSeats) {
            System.out.println("Invalid seat number. Please choose a seat between 1 and " + totalSeats);
            return;
        }

        if (seatAvailability[seatNumber - 1]) {
            System.out.println("Sorry, the seat is already booked. Please choose another seat.");
        } else {
            seatAvailability[seatNumber - 1] = true;
            System.out.println("Ticket booked successfully! Enjoy your show.");
        }
    }
}
