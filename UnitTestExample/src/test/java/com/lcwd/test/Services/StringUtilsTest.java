package com.lcwd.test.Services;

import com.lcwd.test.services.StringUtils;
import org.junit.jupiter.api.*;

public class StringUtilsTest {

    @BeforeAll
    public static void init(){
        System.out.println("before all test cases !");
    }

    @BeforeEach
    public void beforeeach(){
        System.out.println("before each test case !");
    }

    @AfterEach
    public void aftereach(){
        System.out.println("after each test case !");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("after all test cases !");
    }

    @Test
    @DisplayName("reverse string test")
    public void reverseTest(){

        String result = StringUtils.reverse("java");

        String expected = "avaj";

        System.out.println("reverse test case !");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void palindromeTest(){

        boolean result = StringUtils.isPalindrome("madam");

        System.out.println("palindrome test case !");

        Assertions.assertTrue(result);
    }

    @Test
    public void palindromeFalseTest(){

        boolean result = StringUtils.isPalindrome("hello");

        System.out.println("non palindrome test case !");

        Assertions.assertFalse(result);
    }
}