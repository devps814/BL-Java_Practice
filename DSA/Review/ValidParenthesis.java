import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :" );
        String str = sc.nextLine();
        System.out.println(checkValidParenthesis(str));
    }
    public static boolean checkValidParenthesis(String str){
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else{
                if (st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if (ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == '[' && top != ']'){
                        return false;
                }
            }
        }
        return st.isEmpty();

    }
}
