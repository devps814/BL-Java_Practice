package Java8features;

import javax.xml.namespace.QName;
import java.sql.SQLIntegrityConstraintViolationException;

public class Student {
    public Integer id;
    public String name;

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;

    }
    public String toString(){
        return this.id + " : " + this.name;
    }
}
