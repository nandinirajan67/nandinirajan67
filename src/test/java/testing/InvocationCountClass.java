package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvocationCountClass {
    WebDriver driver;

    @Test(invocationCount = 3)
    public void testMethod() throws InterruptedException {
        driver=new EdgeDriver();
        Thread.sleep(3000);
        driver.get("https://secure.facebook.com/");
        driver.quit();
    }
}
