package runner;


import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import static com.base.BaseClass.driver;

public class SimpleAnnotation {


    @BeforeSuite
    public void launchBrowser()  {
        System.out.println("Launch the Browser");
    }

    @BeforeTest
    public void myntraUrl() {
        System.out.println("Myntra application opened");
    }
    @BeforeClass
    public void login(){
        System.out.println("Login successful");
    }
@BeforeMethod
    public void womenDress()  {

        System.out.println("Dress purchased successfully");
}
@Test
    public void menTshirt() {
    System.out.println("men tshirt purchased successfully");
}
        @AfterMethod
                private void logout() throws InterruptedException {
            WebDriver driver=new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.myntra.com/");
            Thread.sleep(3000);
            System.out.println("Logout successfully done");

    }
    @AfterClass
    public void womenTshirt() throws InterruptedException {
        System.out.println("Women Tshirt purchased successfully");
}
@AfterTest
    public void kids() throws InterruptedException {
    WebElement element=driver.findElement(By.xpath("//input[@class='desktop-searchBar'] "));
    Thread.sleep(3000);
//    element.sendKeys("kids");

        System.out.println("Kids purchased successfully");
}
@AfterSuite
    public void close(){
        System.out.println("Page terminated successfully");
}
}
