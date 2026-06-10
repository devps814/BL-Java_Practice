package DesignPatterns.Abstract;

import DesignPatterns.Abstract.EmployeeFactory;

public class Client {
    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();

        e1.salary();
//        Employee e2 = EmployeeFactory.getEmployee((new IOSDevFactory()));
//        e2.name();

    }
}
