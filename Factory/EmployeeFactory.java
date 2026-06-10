package DesignPatterns.Factory;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if (empType.trim().equalsIgnoreCase("IOS Developer")){
            return new IOSDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("Cloud Developer")){
            return new CloudDeveloper();
        }
        else{
            return null;
        }
    }
}
