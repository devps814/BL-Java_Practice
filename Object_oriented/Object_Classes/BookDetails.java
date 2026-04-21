import java.util.Scanner;

public class BookDetails {
    String title;
    String author;
    double price;

    public BookDetails(String title, String author , double price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void Display(){
        System.out.println("Title of Book is : " + title );
        System.out.println("Author of Book is : " + author);
        System.out.println("The price of book is : " + price);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of book : ");
        String title = sc.nextLine();
        System.out.print("Enter the author of book : ");
        String author = sc.nextLine();
        System.out.print("Enter the price : ");
        double price = sc.nextDouble();

        BookDetails info = new BookDetails(title, author, price);
        info.Display();

    }
}
