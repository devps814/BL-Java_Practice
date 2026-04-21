import java.util.Scanner;
class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }


    void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}
public class Movie_Ticket {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        MovieTicket ticket = new MovieTicket();

	        System.out.print("Enter Movie Name: ");
	        String movieName = sc.nextLine();

	        System.out.print("Enter Seat Number (e.g., A10): ");
	        String seatNumber = sc.nextLine();

	        System.out.print("Enter Ticket Price: ");
	        double price = sc.nextDouble();

	        ticket.bookTicket(movieName, seatNumber, price);

	        ticket.displayTicket();
	    }

}