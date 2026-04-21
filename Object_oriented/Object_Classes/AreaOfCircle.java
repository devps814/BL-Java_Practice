import java.util.*;

public class AreaOfCircle {
    double radius;

    public AreaOfCircle(double r) {
        this.radius = r;
    }
    double CalculateArea(){
        return Math.PI *radius*radius;
    }
    double CalculateCircumferene(){
        return 2*Math.PI*radius;
    }
    void Display(){
        System.out.println("Area Of Circle : " + CalculateArea());
        System.out.println("Circumference of Circle : " + CalculateCircumferene());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();

        AreaOfCircle rad = new AreaOfCircle(radius);
        rad.Display();

    }
}
