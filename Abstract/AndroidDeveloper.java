package DesignPatterns.Abstract;

public class AndroidDeveloper implements Employee{
    public int salary(){
        System.out.println("Salary : " + 4000);
        return 4000;
    }
    public String name(){
        System.out.println("Android developer");
        return "AndroidDeveloper";
    }
}
