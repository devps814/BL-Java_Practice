package DesignPatterns.Singelton;

import java.io.Serializable;

public class Student implements Serializable , Cloneable{
    private static Student student;
    private Student(){
//        if (student != null){
//            throw new RuntimeException("trying to break singleton pattern ");
//        }
    }
    // Lazy way to create single object
//    public static Student getStudent(){
//        if (student == null){
//            student = new Student();
//        }
//        return student;
//    }
    // when there are multiple threads , and all the threads together running then there is no type safety.
    // So , we used synchronized block for type safety , only thread at a time go for a block and condition .
     public static Student getStudent(){
        if (student == null){
            synchronized (Student.class){
                if (student == null){
                    student = new Student();
                }
            }
        }
        return student;
     }
     public Object readResolve(){
        return student;
     }
     @Override
     public Object clone() throws CloneNotSupportedException {
        return student;
     }
}

/*
* Singleton Pattern : Create a single object for whole of the code and doing any functionalities with that same object .
* Like there will be only one object/instance to create for execution.
* Mandatory Conditions: 1) Make constructor private 2) make sure the method is static ,
* because non-static method required to call by an object .
*
*
*
*
* */
