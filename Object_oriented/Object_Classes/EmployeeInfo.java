import java.util.*;
public class EmployeeInfo {
    String name;
    int id;
    double salary;

    public EmployeeInfo(String name , int id , double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void Display(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name : ");
        String name = sc.nextLine();
        System.out.print("Enter employee id : ");
        int id = sc.nextInt();
        System.out.print("Enter employee salary : ");
        double salary = sc.nextDouble();

        EmployeeInfo emp = new EmployeeInfo(name , id ,salary);
        emp.Display();

    }

    
}
