package com.oracle.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class UseProperties {
    public static void main(String[]args) throws Exception {
        WebDriver driver;
        FileReader reader = new FileReader("/Users/loaner/Applications/myProject/LearnSelenium/src/main/java/com/test/util/test.properties");
        Properties p3 = new Properties();
        p3.load(reader);

        System.setProperty("webdriver.chrome.driver", p3.getProperty("driverPath"));
        driver = new ChromeDriver();
        driver.get(p3.getProperty("url"));
    }

    }
