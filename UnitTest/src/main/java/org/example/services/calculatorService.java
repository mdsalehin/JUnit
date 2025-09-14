package org.example.services;

public class calculatorService
{
    public static int addTwoNumber(int a,int b)
    {
        return a + b;
    }
    public static int productTwoNumber(int a, int b)
    {
        return a * b;
    }
    public  static double divideTwoNumber(double c, double d)
    {
        if (d == 0)
        {
            throw new ArithmeticException("value must in >=1");
        }
        return (double) c / d;
    }
    public static int sumAnyNumbers(int[] n)
    {
        int sum =0;
        for(int i = 0; i <n.length; i++)
        {
            sum = sum + n[i];
        }
        return sum;
    }
}
