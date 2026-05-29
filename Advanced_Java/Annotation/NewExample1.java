
@MyAnno(myValue=24, name ="Abhi")
public class NewExample1 {
    
}
class Solution{
    public static void main(String[] args) {
        NewExample1 ne = new NewExample1();
        Class c = ne.getClass();
        System.err.println(c.getName());

        MyAnno an = (MyAnno) c.getAnnotation(MyAnno.class);
        System.err.println(an.myValue());
        System.err.println(an.name());
        System.err.println(an.city());
    }
}
