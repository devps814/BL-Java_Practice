package DesignPatterns.Factory;

public class IOSDeveloper implements Employee{

    public int salary(){
        System.out.println("getting salary of ios developer");
        return 50000;
    }
}
