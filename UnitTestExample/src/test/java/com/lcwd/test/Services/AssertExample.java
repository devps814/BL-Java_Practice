package com.lcwd.test.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssertExample {
    @Test
    public void test1() {
        System.out.println("testing some asserting methods! ");
        float actual = 12;
        Float expected = 12.0f;
//        Assertions.assertEquals(actual, expected);

        int[] actualArray = {2, 3, 4, 5, 6};
        int[] expectedArray = {2, 3, 4, 5, 6};
//        Assertions.assertArrayEquals(actualArray, expectedArray);

        String name = new String("rahul");
        String expectedname = new String("rahul");
//        Assertions.assertSame(name, expectedname); for different objects this give us test failed
//        Assertions.assertEquals(name, expectedname);


        boolean ans = false;
//        Assertions.assertTrue(ans);

        List<Integer> list1 = Arrays.asList(2,5,3,6);
        List<Integer> list2 = Arrays.asList(2,5,3,6);
        Assertions.assertIterableEquals(list1, list2);

    }
}