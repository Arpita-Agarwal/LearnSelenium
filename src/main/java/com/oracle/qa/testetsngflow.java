package com.oracle.qa;

import com.aventstack.extentreports.utils.FileUtil;
import com.test.util.utility;
import javafx.scene.layout.Priority;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class testetsngflow {
    WebDriver driver;

    @BeforeTest
    @Parameters({"browserloc"})
    public void invoke_browser(String browserloc) throws MalformedURLException {
       // System.setProperty("webdriver.chrome.driver", browserloc);
       // driver = new ChromeDriver();
        String Node = "http://192.168.99.100:31825/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();

        driver = new RemoteWebDriver(new URL(Node), cap);
        //String huburl ="http://192.168.99.100:31825/wd/hub";
        //WebDriver driver=new RemoteWebDriver(new URL(huburl), options);

    }

    @AfterTest
    public void quit_browser()
    {
        driver.quit();
    }

    @Test (priority=2)
    @Parameters({"url"})
    public void testAutocomplete(String url)
    {
        driver.get(url);
        AutoCompletePage AutoPage= new AutoCompletePage();
        AutoPage.AutoCompletetest(driver);
            }

            @DataProvider
            public Iterator<Object[]> gettestdata() throws Exception {
                ArrayList<Object[]> testdata= utility.getDataFromExcel();
                return testdata.iterator();
            }

    @Test (priority=1, dataProvider = "gettestdata")
    //@Parameters({"firstname","lastname"})
    public void testForm(String firstname, String lastname, String jobtitle) throws Exception {
        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formpage = new FormPage();
        formpage.submitform(driver, firstname,lastname,jobtitle);
        ConfirmationPage confirmPage = new ConfirmationPage();
        confirmPage.waitforalert(driver);
        assertEquals("The form was successfully submitted!", confirmPage.waitforbannertext(driver));
        TakeScreenshot ts=new TakeScreenshot();
        ts.Screenshot(driver, "FormSS");
    }
}