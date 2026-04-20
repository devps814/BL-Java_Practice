import java.util.*;

public class StudentGrade {
    String name;
    int roll_no;
    String subjects;
    double marks;
    double totalMarks;
    double Percentage;
    String grade;
    String result;

    public StudentGrade(String name, int roll_no, double marks, double totalMarks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
        this.totalMarks = totalMarks;
    }

    void calculatePercentage(){
        Percentage = (marks/totalMarks)*100;
    }

    void calculateGrade(){
        if (Percentage >= 90){
            grade = "A+";
            result = "Pass";
        }
        else if (Percentage >= 80){
            grade = "A";
            result = "Pass";
        }
        else if (Percentage >= 70 && Percentage < 80){
            grade = "B";
            result = "Pass";
        }
        else if (Percentage >= 60 && Percentage < 70){
            grade = "C";
            result = "Pass";
        }
        else if (Percentage < 60 && Percentage >= 50){
            grade = "D";
            result = "Pass";
        }else{
            grade = "F";
            result = "Fail";
        }
    }
    void Display(){
        System.out.println("Student report card!....");
        System.out.println("Name  : " + name);
        System.out.println("Roll_no  : " + roll_no);
        System.out.println("Marks  : " + marks);
        System.out.println("Percentage  : " + Percentage + "%");
        System.out.println("Grade  : " + grade);
        System.out.println("result  : " + result);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter student name :");
        String name = sc.nextLine();
        System.out.print("enter student roll_no :");
        int roll_no = sc.nextInt();
        System.out.print("enter student marks :");
        double marks = sc.nextDouble();
        System.out.print("enter student totaMarks :");
        double totalMarks = sc.nextDouble();

        StudentGrade s1 = new StudentGrade(name, roll_no, marks, totalMarks);
        s1.calculatePercentage();
        s1.calculateGrade();
        s1.Display();
         
    }
}
