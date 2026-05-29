class Parent {
    public void printMessage() {
        System.out.println("Hello from Parent");
    }
}
class Helper {
    @Deprecated
    public static void oldMethod() {
        System.out.println("This is old.");
    }
    @Deprecated
    public static void mymethod(){
        System.out.println("hello");
    }
}
public class AnnotationTest extends Parent {

    // 1. A Deprecated method
    // 2. A broken Override (Typo: 'printMessagee' instead of 'printMessage')
    @Override
    public void printMessage() {
        System.out.println("Hello from Child");
    }

    public static void main(String[] args) {
        // 3. Using the deprecated method
        Helper.oldMethod();
        Helper.mymethod();

    }
}

