import java.util.ArrayList;

class Parent {

    @Deprecated
    public void oldMethod() {
        System.out.println("Old Method");
    }
}

class Child extends Parent {

    @Override
    public void oldMethod() {
        System.out.println("Overridden Method");
    }
}

public class OverrideExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Child c = new Child();

        c.oldMethod();

        ArrayList list = new ArrayList();

        list.add("Java");

        System.out.println(list);
    }
}