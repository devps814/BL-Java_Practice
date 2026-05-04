class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
}

class C extends B,A {
}


public class MultipleInheritance {
    public static void main(String[] args) {
         C obj = new C();
         obj.show();
        
    }
}

