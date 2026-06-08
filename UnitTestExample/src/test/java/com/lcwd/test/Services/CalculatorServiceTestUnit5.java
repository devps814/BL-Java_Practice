package com.lcwd.test.Services;
import com.lcwd.test.services.Calculatorservice;
import org.junit.jupiter.api.*;

public class CalculatorServiceTestUnit5 {

    @BeforeAll
    public static void init(){
        System.out.println("before all the test case !");
    }
    @BeforeEach
    public void beforeeach(){
        System.out.println("before each of the test case .");
    }
    @AfterEach
    public void aftereach(){
        System.out.println("after each of the test case .");
    }
    @AfterAll
    public static void cleanup(){
        System.out.println("after all the test case !");
    }
    @Test
    @DisplayName("this is custom name ")
    public void addsumTest(){
        int actualTest = Calculatorservice.addsum(25,75);
        int expectedresult = 100;
        System.out.println("addition test case !");
        Assertions.assertEquals(expectedresult, actualTest,"Test not matched! ");

    }
    @Test
    @Disabled // to disable the test case
    public void sumAnynumTest(){
        int result = Calculatorservice.sumAnynum(15,26,24,25);
        int expected = 90;
        System.out.println("second test case !");
        Assertions.assertEquals(expected, result);

    }
    @Test
    public void subnumTest(){
        int result = Calculatorservice.subsum(15,10);
        int expected = 5;
        System.out.println("subtract test case !");
        Assertions.assertEquals(expected , result);
    }
    @Test
    public void multiplyTest(){
        int result = Calculatorservice.multiply(5,5);
        int expected = 25;
        System.out.println("multiply test case !");
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void divideTes(){
        int result = Calculatorservice.divide(25,5);
        int expected = 5;
        System.out.println("divide test case !");
        Assertions.assertEquals(expected, result);
    }
}
// @Tag - is used to annotate to declare a tsg for the annotated test class or test method .
// @Nested - is used to signal that annotated class is nested
// @TestFactory - is used to signal that the annotated method is a test factory.
