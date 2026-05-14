package pageobjectmodel;

import com.base.BaseClass;

import com.interfaceelements.SearchProductInterfaceElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;



public class SearchProduct extends BaseClass implements SearchProductInterfaceElements {

    @FindBy(xpath = laptop_xpath)
    private static WebElement laptop;

    @FindBy(linkText = variation_linkText)
    private static WebElement variation;

    @FindBy(xpath = add_to_cart_xpath)
    private static WebElement addToCart;

    public SearchProduct() {
        PageFactory.initElements(driver, this);
    }

    public static void searchProduct() throws InterruptedException {
        clickOnElement(laptop);
       Thread.sleep(3000);
        clickOnElement(variation);
        Thread.sleep(3000);
        clickOnElement(addToCart);
        Thread.sleep(3000);
alertAction("accept");

    }
}