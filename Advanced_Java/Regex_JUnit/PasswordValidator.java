public class PasswordValidator {

    public static void main(String[] args) {

        String password = "Dev@1234";

        String pattern =
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

        if (password.matches(pattern)) {
            System.out.println("Strong Password !");
        } else {
            System.out.println("Weak Password !");
        }
    }
}