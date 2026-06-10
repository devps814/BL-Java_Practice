package DesignPatterns.Singelton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Class {
    public static void main(String[] args) throws Exception{

//        Student student1 = Student.getStudent();
//        System.out.println(student1.hashCode());
//
//        Student student2 = Student.getStudent();
//        System.out.println(student2.hashCode());
//
//        System.out.println(Subject.getSubject().hashCode());
//        System.out.println(Subject.getSubject().hashCode());


        /*
        * How to break singleton pattern :
        * 1). BY using Reflection API
        * Solution : 1). if object is there then throw an exception from inside constructor.
        *            2). enum
        * 2). Deserializable
        * Solution : implementing readResolve method
        *
        * 3). Cloning
        * Solution : return object like student;
        *
        *
        * */
//        Student s1 = Student.getStudent();
//        System.out.println(s1.hashCode());
//
//        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Student s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

        Student student = Student.getStudent();
        System.out.println(student.hashCode());

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(student);
//        System.out.println("Serializable done!");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Student s2 = (Student)ois.readObject();
//        System.out.println(s2.hashCode());

        Student s2 = (Student)student.clone();
        System.out.println(s2.hashCode());
    }
}
