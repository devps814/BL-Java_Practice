package DesignPatterns.Factory;

public class DeveloperType {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("IOS Developer");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("Salary : " + salary );

    }
}
