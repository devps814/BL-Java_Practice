import java.util.regex.*;

public class PhoneExtractor {

    public static void main(String[] args) {

        String text = "My numbers are 9876543210 , 978546214 and 9123456789.";

        String pattern = "\\d{10}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Phone Number: " + m.group());
        }
    }
}