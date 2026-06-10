package DesignPatterns.Review;

public class Student implements Observer{
    private String name;
    public  Student(String name){
        this.name = name;
    }
    public void notify(String message){
        System.out.println(name + " received information: " + message);
    }
}
