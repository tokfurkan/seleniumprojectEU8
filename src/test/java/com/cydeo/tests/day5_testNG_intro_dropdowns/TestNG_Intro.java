package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("BeforeClass is running!");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){ //it will get executed before each @Test
        System.out.println("BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){ //it will get executed after each @Test
        System.out.println("AfterMethod is running!");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");

        //assert.equals --> compares 2 of the same things
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");

        //assert.true --> accepts Boolean as parameter, returns Boolean again
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));

    }

    //@BeforeClass will get executed only ONCE before each method
    //@BeforeMethod will get executed several times (before tests)
    //@AfterMethod will get executed after each test
    //@AfterClass will get executed after all methods got executed, it will run as final





}
