package IOProgramming_Multithreading.Java8features;

public class SE {
    public static void main(String[] args) {
//        Employee emp = () -> "new employee";
//        System.out.println(emp.greet());
//        Student s1 = new Student(101, "Akash");
//        Student s2 = new Student(102, "Akshay");
//        Student s3 = new Student(103,"Shiva");
//        List<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        Collections.sort(list, (a,b) -> b.id - a.id );
//        System.out.println(list);

        Employee employee = new Employee() {
            int x = 10;
            @Override
            public String greet() {
                System.out.println(this.x);
                return "Hey ! good evening";
            }

            @Override
            public String getdesignation() {
                return "Software engineer ";
            }
        };
        System.out.println(employee.getdesignation());
        System.out.println(employee.greet());
// If there are single abstract method then we will use lambda expression and
// if there are multiple abstract methods then we use anonymous class.




// Runnable Interface
//        Runnable runnable = () ->{
//            for (int i = 0; i <= 10 ; i++){
//                System.out.println("Hello lambda " + i);
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.run();

    }
}

//Runnable is a functional interface ,
// it is like a pre-defined interface in which we use lambda expression and pass to thread for execution.

// there are some more interface like Map for using TreeMap, Set for using TreeSet where we can use lambda expression.
// we can use for sorting.
// TreeSet, TreeMap constructor can accept the comparator .
// We can also use for custom expression for a class .

