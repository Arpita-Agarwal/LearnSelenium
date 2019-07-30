package com.oracle.qa;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
 public class testetsng {
     @BeforeSuite
     public void beforSu()

     {
         System.out.println("BeforeSuite-Setting property for chrome");
     }

     @BeforeTest
     public void beforTes()

     {
         System.out.println("BeforeTest-Invokebrowser");
     }

     @BeforeClass
     public void beforClass()

     {
         System.out.println("BeforeClass- Enter URL");
     }

     @BeforeMethod
     public void beforMethod()

     {
         System.out.println("Before Method-Login to app");
     }

     @Test
     public void test1()

     {
         System.out.println("inside test1");
     }


     @Test
     public void test2()

     {
         System.out.println("inside test2");
     }

     @AfterMethod
     public void afterMet()

     {
         System.out.println("AfterMethod- Logout from app");
     }

     @AfterClass
     public void AfteClass()

     {
         System.out.println("AfterClass- delete cookies");
     }

     @AfterTest
     public void AfteTes()

     {
         System.out.println("AfterTest- delete url");
     }

     @AfterSuite
     public void AfteSui()

     {
         System.out.println("AfterSute-close browser");
     }
 }