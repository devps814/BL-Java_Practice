class Book{
    private int bookId;
    private String title;
    private String author;
    private double prices;

    private static int totalBooks = 0;

    public Book(int bookId, String title, String author, double prices){
        this.author = author;
        this.bookId = bookId;
        this.title = title;
        this.prices = prices;

        totalBooks++;
    }
    public int getbookId(){
        return bookId;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public double getprices(){
        return prices;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public void setprices(double prices){
        this.prices = prices;
    }
    public static int getTotalBooks(){
        return totalBooks;
    }

}
class Member{
    int memberId;
    String name;
    Book[] borrowedBooks;
    int count =0;
    String voucher;


    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
        borrowedBooks = new Book[5];
    }

    Member(int memberId ,String name, String voucher ){  
        this(memberId, name);
        this.voucher = voucher;
    }
    public void borrowBook(Book b){
        if (count < borrowedBooks.length){
            borrowedBooks[count] = b;
            count++;
            System.out.println(name + " borrowed " + b.gettitle());
        }else{
            System.out.println("Borrow limit reached for : " + name );
        }
    }
}
public class LibraryBook {
    public static void main(String[] args){
        Book b1 = new Book(101,"Java","James",1000);
        Book b2 = new Book(102, "Python" , "Peterson" , 5000);
        Book b3 = new Book(103,"Computer Science ", "Rowling", 3000);

        Member m1 = new Member(1,"Dev");
        Member m2 = new Member(2,"Aditya");
        Member m3 = new Member(45, "Dinesh", "HURRAY");

        m1.borrowBook(b1);
        m1.borrowBook(b2);
        m2.borrowBook(b3);

        Object[] arr = new Object[5];
        arr[0] = b1;
        arr[1] = b2;
        arr[2] = b3;
        arr[3] = m1;
        arr[4] = m2;

        System.out.println("Checking object types :");

        for (Object obj : arr){
            if (obj instanceof Book){
                System.out.println("Book Object ");
            }else if (obj instanceof Member){
                System.out.println("Member Object ");
            }
        }
        System.out.println("Total Books = " + Book.getTotalBooks());

        System.out.println("Book title : " + b1.gettitle());
    }
}
