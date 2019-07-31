package com.oracle.qa;

import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class testetsngflow {
    WebDriver driver;

    @BeforeTest
    public void invoke_browser() {
        System.setProperty("webdriver.chrome.driver", "/Users/loaner/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void quit_browser()
    {
        driver.quit();
    }

    @Test (priority=2)
    public void testAutocomplete()
    {
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        AutoCompletePage AutoPage= new AutoCompletePage();
        AutoPage.AutoCompletetest(driver);
            }

    @Test (priority=1)
    public void testForm() throws Exception {
        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formpage = new FormPage();
        formpage.submitform(driver);
        ConfirmationPage confirmPage = new ConfirmationPage();
        confirmPage.waitforalert(driver);
        assertEquals("The form was successfully submitted!", confirmPage.waitforbannertext(driver));
    }
}