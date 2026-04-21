import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand , String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void Display(){
        System.out.println();
        System.out.println("Brand of phone : " + brand);
        System.out.println("Model of phone : " + model);
        System.out.println("Price of phone : Rs. " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the brand of phone : ");
        String brand = sc.nextLine();
        System.out.print("Enter the model of phone : ");
        String model = sc.nextLine();
        System.out.print("Enter the price of phone : ");
        Double price = sc.nextDouble();

        MobilePhone info = new MobilePhone(brand, model, price);
        info.Display();
    }

    
}
