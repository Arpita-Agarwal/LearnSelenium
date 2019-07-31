package com.oracle.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitform(WebDriver driver) throws Exception {
        ReadDataExcel RedData=new ReadDataExcel();
        RedData.ReadData();
        driver.findElement(By.id("first-name")).sendKeys("Arpita");
        driver.findElement(By.id("last-name")).sendKeys("Agarwal");
        driver.findElement(By.id("job-title")).sendKeys("QA");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("03/03/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

}
