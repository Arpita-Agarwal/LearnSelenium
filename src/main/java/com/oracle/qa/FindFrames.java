package com.oracle.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class FindFrames {
    public static void main(String[]args)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/loaner/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        //count number of frames----
        List<WebElement> totalframes= driver.findElements(By.tagName("iframe"));
        System.out.println("Total frames:" + totalframes.size());

        //count number of links and check broken links---
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("Total links:" + links.size());

        for (int i=0;i<links.size();i++)
        {
            WebElement element=links.get(i);
            String url=element.getAttribute("href");
            verifyLink(url);
        }

        //count number of images---
        driver.get("https://www.w3schools.com/html/html_images.asp");
        List<WebElement> images= driver.findElements(By.tagName("img"));
        System.out.println("Total images:" + images.size());
        driver.quit();

        driver = new ChromeDriver();
        driver.get("https://baijs.com/tinyscrollbar/");
        JavascriptExecutor jse= (JavascriptExecutor) driver;

        WebElement afterScroll=driver.findElement(By.xpath("//*[@id=\"scrollbar1\"]/div[2]/div/p[5]"));
        //WebElement draggablescroll=driver.findElement(By.xpath("//*[@id=\"scrollbar1\"]/div[1]/div/div/div"));

        jse.executeScript("arguments[0].scrollIntoView(true);",afterScroll );
        System.out.println(afterScroll.getText());
        driver.quit();
        }

        public static void verifyLink(String urlLink)
        {
            try {
                URL link=new URL(urlLink);
                HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
                httpConn.setConnectTimeout(2000);
                httpConn.connect();
                if(httpConn.getResponseCode()==200) {
                    System.out.println(urlLink + "-" + httpConn.getResponseMessage());
                }
                if(httpConn.getResponseCode()==404) {
                    System.out.println(urlLink+ "- " + httpConn.getResponseMessage());
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

