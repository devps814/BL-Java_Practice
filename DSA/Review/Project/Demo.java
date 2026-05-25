import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.printname(20,24));
    }
}
class Box{
    //Wildcard
    List<?> list = new ArrayList<Demo>();
    

    public <T extends Number , U extends Number> Double printname(T first , U second){
        return first.doubleValue() + second.doubleValue();
    }
}

// class Box{
//     private int value;
//     private String name;

//     Box(int value ){
//         this.value = value;
//     }
//     Box(String name){
//         this.name = name;
//     }
//     public String setname(String name ){
//         return this.name = name;
//     }
//     public String getname(){
//         return this.name;
//     }

//     public int setvalue(int value){
//         return this.value = value;
//     }
//     public int getvalue(){
//         return this.value;
//     }
// }

// class Test<T> {
//     // An object of type T is declared
//     T obj;
//     Test(T obj) { this.obj = obj; } // constructor
//     public T getObject() { return this.obj; }
// }

// class Geeks {
//     public static void main(String[] args)
//     {
//         // instance of Integer type
//         Test<Integer> iObj = new Test<Integer>(15);
//         System.out.println(iObj.getObject());

//         // instance of String type
//         Test<String> sObj
//             = new Test<String>("GeeksForGeeks");
//         System.out.println(sObj.getObject());
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         // Upcasting
//         String s = "Hello";
//         Object obj = s;

//         System.out.println(obj);

//         // Downcasting
//         Object obj2 = "Aditya";
//         String s2 = (String) obj2;

//         // System.out.println(s2);

//         Object obj3 = 10;
//         String s3 = (String) obj3;

//         // System.out.println(s3);
//     }
// }