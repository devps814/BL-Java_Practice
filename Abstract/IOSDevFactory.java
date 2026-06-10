package DesignPatterns.Abstract;

public class IOSDevFactory extends EmployeeAbstractFactory {

    @Override
    public IOSDeveloper createEmployee() {
        return new IOSDeveloper();
    }
}
