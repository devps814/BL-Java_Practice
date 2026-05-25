import java.util.Scanner;
public class ValidateInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user input for name : ");
        String user_name = sc.nextLine();
        System.out.println("Enter the valid age of user : ");
        int age = sc.nextInt();
        try{
            checkvalidation(user_name,age);
            System.out.println("User-Input is Valid !");
        }catch(InvalidInputException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("End the program !");
        }
        
    }
    public static void checkvalidation(String name, int age) throws InvalidInputException{
        if (name == null || name.trim().isEmpty() ){
            throw new InvalidInputException("User-name is invalid or name is blank !");
        }
        else if (age <= 0){
            throw new InvalidInputException("user age is invalid !");
        }
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}
