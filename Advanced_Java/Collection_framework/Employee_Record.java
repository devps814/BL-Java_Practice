import java.util.Scanner;
import java.util.HashMap;


public class Employee_Record {
    private int id ;
    private String name;
    private String department;

    public Employee_Record(int id , String name , String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getdepartment(){
        return department;
    } 

    
}
class Main{
    public static void main(String[] args) {
        HashMap<Integer, Employee_Record> map = new HashMap<>();

        Employee_Record er1 = new Employee_Record(101, "Dev", "CSE");
        Employee_Record er2 = new Employee_Record(102, "Rohit" ,"CSe_Io");
        Employee_Record er3 = new Employee_Record(103, "Adi","CSE_AI");

        map.put(er1.getid(), er1);
        map.put(er2.getid(),er2);
        map.put(er3.getid(), er3);

        Scanner sc = new Scanner(System.in);
        int searchid = sc.nextInt();

        if (map.containsKey(searchid)){
            Employee_Record found = map.get(searchid);

            System.out.println("Id found in the record ! ");
            System.out.println("Name of the employee : " + found.getname());
            System.out.println("Department of the employee : " + found.getdepartment());
        }
        else{
            System.out.println("Id record not found !");
        
        }
    }
}
