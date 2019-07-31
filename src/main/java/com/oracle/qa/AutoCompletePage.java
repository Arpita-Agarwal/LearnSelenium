package com.oracle.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AutoCompletePage {
    public static void AutoCompletetest(WebDriver driver)
    {
        driver.findElement(By.id("autocomplete")).sendKeys("1600 N OAK Street,Arlington,VA");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
        autocompleteresult.click();

    }
}
