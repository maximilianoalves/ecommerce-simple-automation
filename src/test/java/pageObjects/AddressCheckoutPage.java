package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressCheckoutPage extends BasePage {

    @FindBy(name = "processAddress")
    public WebElement proceedToCheckout;

    public void clickProceedToCheckout() {
        proceedToCheckout.click();
    }
}
