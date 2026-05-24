package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParameterizationClass {

    WebDriver driver;

    @Test(invocationCount = 4)
    @Parameters({"username", "password"})
    public void methodOne(String username, String password) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();
    }
}
