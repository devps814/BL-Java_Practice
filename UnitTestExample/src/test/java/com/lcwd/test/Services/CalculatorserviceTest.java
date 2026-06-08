//package com.lcwd.test.Services;
//import com.lcwd.test.services.Calculatorservice;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorserviceTest {
//
//    int counter = 0;
//    @BeforeClass // to use this annotation for execute anything before any test cases
//    public static void newinit(){
//        System.out.println("Before all the test cases ");
//        System.out.println("Started date : " + new Date());
//    }
//
//    @Before //to use this annotation to execute before each test case.
//    public void beforeeach(){
//        System.out.println("Before each test case");
//        counter = 0;
//    }
//
//    @Test
//    public void addsumTest(){
//        for (int i =0; i < 15; i++){
//            counter += i;
//        }
//        System.out.println("test cases for addsumTest ");
//        int result = Calculatorservice.addsum(14,26);
//        int expected = 40;
//        System.out.println("Counter for 1st test case : " + counter);
//        Assert.assertEquals(expected,result);
//        // actual : result
//        // expected : expected result
//        // Assert : match or check that expected or actual equal or not
//    }
//    @Test
//    public void sumAnynumTest(){
//        for (int i = 0; i < 25; i++){
//            counter += i;
//        }
//        System.out.println("test cases for sumAnynumTest ");
//        int result = Calculatorservice.sumAnynum(2,5,7,9,3);
//
//        int expected = 26;
//        System.out.println("Counter for 2nd test case : " + counter);
//        Assert.assertEquals(expected , result);
//    }
//    @AfterClass // after all the test cases , if any file or anything that wants to close,
//    // after all the test case then use AfterClass
//    public static void cleanup(){
//        System.out.println("Cleaning up all the test cases ");
//        System.out.println("Started date : " + new Date());
//    }
//}
