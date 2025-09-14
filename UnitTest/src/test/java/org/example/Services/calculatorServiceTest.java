package org.example.services;
import org.junit.*;
import java.util.Scanner;

import java.util.Date;

public class calculatorServiceTest
{
    @BeforeClass
    public static void before()
    {
        System.out.println("Started test : " + new Date());
        System.out.println("Before All Test cases");
    }

    @Before
    public void runBeforeTestCase()
    {
        System.out.println("Run Befor Each Test Cases....");
    }


    @Test(timeout = 1000)
    public void addTwoNumberTest()
    {
        //actual Result
        //expected Result

        int result  = calculatorService.addTwoNumber(12,45);
        int expected = 57;
        int  actual  = 57;
        Assert.assertEquals(expected,actual);
        //For the experiment Both Will pass.....
        Assert.assertEquals(expected,result);
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Test for addTwoNumber SuccessFully Execute");
    }


    @Test
    public  void productTwoNumber()
    {

        int a = 5;
        int b = 6;
        int product = calculatorService.productTwoNumber(a,b);

        int expected = a*b;
        Assert.assertEquals(expected,product);
        System.out.println("Test for productTwoNumber SuccessFully Execute");
    }


    @Test
    public void productTwoNumberDynamic()
    {

        int a = 5;
        int b = 6;

        int actual =  calculatorService.productTwoNumber(a,b);
        int expected = a*b;

        Assert.assertEquals(expected,actual);
        System.out.println("Test for productTwoNumberDynamic Way SuccessFully Execute");
    }


    @Test
    public void DivideTwoNumber()
    {

        double temp = calculatorService.divideTwoNumber(5.5,6);
        double expected = 5.5 / 6.0;

        Assert.assertEquals(expected,temp,0.0);
        System.out.println("Test for DivideTwoNumber SuccessFully Execute");

    }


    @Test
    public void sumAnyNumbers()
    {

        int store = calculatorService.sumAnyNumbers(new int[]{1,2,3,4,5,6,7,8,9,10});

        int expected = 55;
        Assert.assertEquals(expected,store);

        System.out.println("Test for sumAnyNumbers SuccessFully Execute");
    }


    @After
    public void runAfterTestCase()
    {
        System.out.println("Run After Each Test Cases....");
    }

    @AfterClass
    public static void afterCleanUp()
    {
        System.out.println("After All test Case..");
    }
}
