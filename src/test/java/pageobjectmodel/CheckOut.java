package pageobjectmodel;

import com.base.BaseClass;
import com.interfaceelements.CheckOutInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CheckOut extends BaseClass implements CheckOutInterfaceElements {

@FindBy (xpath = cart_xpath)
private static WebElement cart;
@FindBy(xpath = place_order_xpath)
    private static WebElement placeorder;

    public CheckOut() {
        PageFactory.initElements(driver, this);

    }
    public static void checkOut() throws InterruptedException {
        Thread.sleep((6000));
        clickOnElement(cart);
        Thread.sleep(3000);

        clickOnElement(placeorder);
        Thread.sleep(4000);
    }
}
