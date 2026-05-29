import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    int myValue() default 0;
    String name() default "Dev";
    String city() default "Delhi";
}
// Marker annotation :  In the interface when their is no passed value or blank body then the it said to be marker annotation .
// Single value annoatation : In the interface when there is single value passed in a whole interface or body then it is said 
// to be single value annoatation .
// multi value annoatation : In the interface when there is multi valued passed in a whole interface or a body then it is said 
// to be multi valued annoatation .