import java.util.Scanner;

public class StudentInfo {
    String name;
    int rollno;
    int marks;

    StudentInfo(String name , int rollno, int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    String CalculateGrade(){
        if (marks >= 95) return "A+";
        else if (marks >= 90 && marks < 95) return "A";
        else if (marks >= 80 && marks < 90) return "B";
        else if (marks >= 70 && marks < 80) return "C";
        else if (marks >= 60 && marks < 70) return "D";
        else return "F";
    }
    void Display(){
        System.out.println("Student Report : ....");
        System.out.println("Name of Student : " + name);
        System.out.println("Rollno of student : " + rollno);
        System.out.println("Marks of Student : " + marks);
        System.out.println("Grade of student : " + CalculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student : ");
        String name = sc.nextLine();
        System.out.println("Enter the rollno of Student : ");
        int rollno = sc.nextInt();
        System.out.println("Enter the marks of Student : ");
        int marks = sc.nextInt();

        StudentInfo info = new StudentInfo(name, rollno, marks);
        info.Display();

    }
    
}
