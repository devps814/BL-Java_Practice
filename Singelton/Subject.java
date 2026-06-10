package DesignPatterns.Singelton;

//Eager way to create a singleton object
public class Subject {
    private static final Subject subject = new Subject();

    public static Subject getSubject(){
        return subject;
    }
}
