package DesignPatterns.Abstract;

public class IOSDeveloper implements Employee{
    public int salary(){
        return 5000;
    }
    public String name(){
        System.out.println("IOS developer");
        return "IOS Developer";
    }
}
