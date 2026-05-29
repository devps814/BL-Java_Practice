import java.lang.reflect.Method;

public class AnnotationReader {

    public static void main(String[] args) {

        TaskManager obj = new TaskManager();

        Method[] methods = obj.getClass().getDeclaredMethods();

        for(Method method : methods){

            if(method.isAnnotationPresent(ImportantTask.class)){

                ImportantTask task =
                        method.getAnnotation(ImportantTask.class);

                System.out.println("Method Name : "
                        + method.getName());

                System.out.println("Priority : "
                        + task.priority());

                System.out.println();
            }
        }
    }
}