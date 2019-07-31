package com.oracle.qa;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;

public class TakeScreenshot {
    public void Screenshot(WebDriver driver, String screenshot) throws IOException {
        TakesScreenshot ts= (TakesScreenshot)driver;
        File source= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("/Users/loaner/Applications/myProject/LearnSelenium/src/main/Reports/" +screenshot +".png"));

    }
}
