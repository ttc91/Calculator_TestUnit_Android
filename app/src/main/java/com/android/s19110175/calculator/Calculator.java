package com.android.s19110175.calculator;


public class Calculator {

    public double addTwoNumbers(double a, double b){
        return a + b;
    }

    public double subTwoNumbers(double a, double b){
        return a - b;
    }

    public double mulTwoNumbers(double a, double b){
        return a * b;
    }

    public double divTwoNumbers(double a, double b){
        return a / b;
    }

    public Double exponentialNumber(double a, double b){
        if(a < 0 || a == 1){
            return null;
        }
        return Math.pow(a,b);
    }

    public Integer factorialNumber(int a) throws ExceptionInInitializerError{
        if (a > 0){
            Integer result = 1;

            for (int i = 1; i <= a; i++){
                result = result * i;
            }

            return result;
        }
        throw new ExceptionInInitializerError();
    }

    public double logarithmNumber(double a, double x) throws ExceptionInInitializerError{

        if(a > 0 && a != 1){
            return Math.log(x) / Math.log(a);
        }

        throw new ExceptionInInitializerError();
    }

}
