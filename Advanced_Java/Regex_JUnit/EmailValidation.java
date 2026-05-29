import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        Pattern pat = Pattern.compile(regex);
        String[] emails = {"devprataps814@gmail.com", "dev.singh_cs22@gla.ac.in" , "rahul123@gmail.com"};

        for (String email : emails){
            Matcher mat = pat.matcher(email);

            System.out.println("Match found : " + mat.matches());
        }

    }
}
