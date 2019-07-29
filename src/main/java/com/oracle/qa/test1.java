package com.oracle.qa;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class test1 {
    WebDriver driver;

    public void invoke_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/loaner/Downloads/chromedriver");
        driver=new ChromeDriver();

/*driver.get("http://www.google.com");
    WebElement element= driver.findElement(By.name("q"));
    element.sendKeys("test");
    element.submit();*/

/*driver.get("https://formy-project.herokuapp.com/autocomplete");
WebElement element=driver.findElement(By.id("autocomplete"));
element.sendKeys("1600 N OAK Street,Arlington,VA");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//Thread.sleep(1000);
WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
autocompleteresult.click();*/

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

        /*driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image=driver.findElement(By.id("image"));

        WebElement box=driver.findElement(By.id("box"));
        Actions action=new Actions(driver);
        action.dragAndDrop(image,box).build().perform();*/


        /*driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radiobutton1=driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        WebElement radiobutton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();
        WebElement radiobutton3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobutton3.click();*/

        /*driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datepicker1=driver.findElement(By.id("datepicker"));
        datepicker1.sendKeys("03/03/2020");
        datepicker1.sendKeys(Keys.RETURN);*/

        /*driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdownmenu=driver.findElement(By.id("dropdownMenuButton"));
        dropdownmenu.click();
        WebElement autolist=driver.findElement(By.id("autocomplete"));
        autolist.click();*/

        /*driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileuploadfield=driver.findElement(By.id("fileuploadfield"));
        fileuploadfield.sendKeys("test.png");*/

        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("Arpita");
        driver.findElement(By.id("last-name")).sendKeys("Agarwal");
        driver.findElement(By.id("job-title")).sendKeys("QA");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("03/03/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement alert=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        String alerttext= alert.getText();
      //  assertEquals("The form was successfully submitted!",alerttext);
        driver.quit();

    }



    public static void main(String[] args) throws InterruptedException {
        test1 obj=new test1();
        obj.invoke_browser();
        System.out.println("Hello");
    }
}



