package com.oracle.qa;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
    WebDriver driver;

    public void invoke_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/loaner/Downloads/chromedriver");
        driver=new ChromeDriver();

/*driver.get("http://www.google.com");
    WebElement element= driver.findElement(By.name("q"));
    element.sendKeys("test");
    element.submit();*/

/* driver.get("https://formy-project.herokuapp.com/autocomplete");
WebElement element=driver.findElement(By.id("autocomplete"));
element.sendKeys("1600 N OAK Street,Arlington,VA");
Thread.sleep(1000);
WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
autocompleteresult.click(); */

/*driver.get("https://formy-project.herokuapp.com/scroll");
WebElement name=driver.findElement(By.id("name"));
Actions action=new Actions(driver);
action.moveToElement(name);
name.sendKeys("Arpita");

WebElement date=driver.findElement(By.id("date"));
date.sendKeys("01/01/2020");*/

/*driver.get("https://formy-project.herokuapp.com/switch-window");
WebElement newTabbutton=driver.findElement(By.id("new-tab-button"));
newTabbutton.click();
String OriginalHandle=driver.getWindowHandle();
for(String Handle1: driver.getWindowHandles())
    driver.switchTo().window(Handle1);

driver.switchTo().window(OriginalHandle);*/

/*        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertbutton=driver.findElement(By.id("alert-button"));
        alertbutton.click();
        Alert alert=driver.switchTo().alert();*/

        /*driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modalbutton=driver.findElement(By.id("modal-button"));
        modalbutton.click();
        WebElement closebutton=driver.findElement(By.id("close-button"));
        JavascriptExecutor js;
        js = (JavascriptExecutor)driver;
        js.executeScript("argument[0].click();",closebutton);*/

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image=driver.findElement(By.id("image"));

        WebElement box=driver.findElement(By.id("box"));
        Actions action=new Actions(driver);
        action.dragAndDrop(image,box).build().perform();
        driver.quit();


    }


    public static void main(String[] args) throws InterruptedException {
        test1 obj=new test1();
        obj.invoke_browser();
        System.out.println("Hello");
    }
}



