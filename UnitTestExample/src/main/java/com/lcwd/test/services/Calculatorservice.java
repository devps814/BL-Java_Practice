package com.lcwd.test.services;

public class Calculatorservice {
    public static int addsum(int a , int b){
        return a+b;
    }
    public static int subsum(int a , int b){
        return a - b;
    }
    public static int multiply(int a , int b){
        return a * b;
    }
    public static int divide(int a , int b){
        return a / b;
    }
    public static int sumAnynum(int ...num){
        int sum = 0;
        for (int i : num){
            sum += i;
        }
        return sum;
    }
}
