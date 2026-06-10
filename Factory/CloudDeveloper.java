package DesignPatterns.Factory;

public class CloudDeveloper implements Employee{

    public int salary(){
        System.out.println("getting salary on Cloud developer");
        return 60000;
    }
}
