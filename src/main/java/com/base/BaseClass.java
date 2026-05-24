package com.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class BaseClass {
    public static WebDriver driver;

    public static ExtentReports extentReports;
    public static File file;

    public static void extentReportStart(String location) {
        extentReports = new ExtentReports();
        file = new File(location);
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("os", System.getProperty("os.name"));
        extentReports.setSystemInfo("java version", System.getProperty("java.version"));
    }

    public static void extentReportTearDown(String location) throws IOException {
        extentReports.flush();
        file = new File(location);
        Desktop.getDesktop().browse((file).toURI());
    }

    protected static WebDriver launchBrowser(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
        } catch (Exception e) {
            Assert.fail("ERROR: DURING BROWSER LAUNCH");
        }
        driver.manage().window().maximize();
        return driver;
    }

    protected static void launchUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING URL LAUNCH");
        }

    }

    protected static void passInput(WebElement element, String value) {
        try {
            element.sendKeys(value);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR DURING VALUE PASSING");
        }
    }

    protected static void clickOnElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            Assert.fail("ERROR:OCCURRED DURING CLICK ON ELEMENT");
        }
    }

    protected static void windowsHandling(int number) {
        try {
            List<String> allWindow = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(allWindow.get(number));
        } catch (Exception e) {
            Assert.fail("ERROR:OCCUR DURING VALUE PASSING");
        }
    }

    protected static void selectOptions(WebElement element, String type, String value) {
        Select select = new Select(element);
        try {
            if (type.equalsIgnoreCase("TEXT")) {
                select.selectByVisibleText(value);
            } else if (type.equalsIgnoreCase("INDEX")) {
                select.selectByIndex(Integer.parseInt(value));
            } else if (type.equalsIgnoreCase("VALUE")) {
                select.selectByValue(value);
            }
        } catch (Exception e) {
            Assert.fail("ERROR:OCCUR DURING VALUE PASSING");
        }
    }

    protected static void deselectOptions(WebElement element, String type, String value) {
        Select select = new Select(element);
        try {
            if (type.equalsIgnoreCase("TEXT")) {
                select.deselectByVisibleText(value);
            } else if (type.equalsIgnoreCase("INDEX")) {
                select.deselectByIndex(Integer.parseInt(value));
            } else if (type.equalsIgnoreCase("VALUE")) {
                select.deselectByValue(value);
            }
        } catch (Exception e) {
            Assert.fail("ERROR:OCCUR DURING VALUE PASSING");
        }
    }

    protected static void navigateToUrl(String url) {
        try {
            driver.navigate().to(url);
        } catch (Exception e) {
            Assert.fail("ERROR:OCCUR DURING VALUE PASSING");
        }
    }

    protected static void navigateBack() {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            Assert.fail("ERROR:OCCUR DURING BACK");
        }
    }

    protected String takeScreenshot() throws IOException {
           TakesScreenshot screenshot = (TakesScreenshot) driver;
            String timeStamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
            File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
            File destfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
            FileHandler.copy(scrfile, destfile);
            return destfile.getAbsolutePath();
               }

    protected static void navigateForward() {
        try {
            driver.navigate().forward();
            } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING FORWARD");
        }}
        protected static void validation(WebElement element, String expected){
            try{
                String actual=element.getText();
                System.out.println(actual);
                Assert.assertEquals(actual,expected);

            } catch (Exception e) {
                Assert.fail("ERROE OCCUR DURING VALIDATION");
            }
        }

    protected static void refresh() {
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            Assert.fail("ERROR:OCCUR DURING VALUE PASSING");
        }
    }

    protected static void getTitle() {
        try {
            String title = driver.getTitle();
            System.out.println(title);

        } catch (Exception e) {

            Assert.fail("ERROR: OCCUR GETTING TITLE");
        }
    }

    protected static void getText(WebElement element) {
        try {
            String text = element.getText();
            System.out.println(text);

        } catch (Exception e) {

            Assert.fail("ERROR OCCURE DURING TEXT GETTING");

        }
    }
    protected static void elementEnabled (WebElement element){
        try{
            element.isEnabled();
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING ELEMENT SELECTED");
        }
    }
    protected static void elementDisplayed(WebElement element){
        try{
            element.isDisplayed();
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING ELEMENT DISPLAYED");
        }
    }

    protected static void elementSelected(WebElement element){
        try{
            element.isSelected();
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING ELEMENT SELECTED");
        }
    }
    protected static void alertAction(String action){
        try{
            Alert alert = driver.switchTo().alert();
            if(action.equalsIgnoreCase("accept")){
                alert.accept();
            } else if (action.equalsIgnoreCase("dismiss")) {
                alert.dismiss();
            }
        } catch (RuntimeException e) {
            Assert.fail("ERROR OCCURRED DURING ALERT");
        }}

    protected static void alertValue(String value){
        Alert alert=driver.switchTo().alert();
        try{
            alert.accept();
            String text = alert.getText();
            System.out.println(text);

        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING ALERT DISMISSED");
        }}


protected static void frameAction(String id){
        try{
            driver.switchTo().frame(id);
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING FRAME ACTION");
        }
}
protected static void close(){
        try{
            driver.quit();
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING CLOSING THE PROGRAM");
        }
}

}










