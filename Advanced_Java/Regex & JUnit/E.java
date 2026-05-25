
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Happy");
        Matcher m = p.matcher("Happyhome");

        while (m.find()){
            System.out.println("Pattern found from : " + m.start() + " to " + (m.end()-1  ));
        }
    }
}
