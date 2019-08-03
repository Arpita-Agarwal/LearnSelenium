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
        Properties p = new Properties();
        p.load(reader);

        System.setProperty("webdriver.chrome.driver", p.getProperty("driverPath"));
        driver = new ChromeDriver();
        driver.get(p.getProperty("url"));
    }

    }
