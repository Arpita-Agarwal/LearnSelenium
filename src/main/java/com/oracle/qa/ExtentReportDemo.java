package com.oracle.qa;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ExtentReportDemo {

    @Test

    public void testreport() {
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("/Users/loaner/Applications/myProject/LearnSelenium/src/main/Reports/ExtentReport.html");
        ExtentReports extent= new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger=extent.createTest("Login to Test");
        logger.log(Status.PASS, "Test is Passed");
        logger.log(Status.FAIL, "Test is Fail");
        logger.log(Status.INFO, "This is info");
        extent.flush();
        ExtentTest logger2=extent.createTest("Logoff Test");
        logger2.log(Status.FAIL, "Test is Failed");
        extent.flush();
    }
}
