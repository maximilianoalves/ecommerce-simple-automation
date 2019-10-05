package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(linkText = "Proceed to checkout")
    public WebElement proceedToCheckout;

    public void clickProceedToCheckout() {
        proceedToCheckout.click();
    }
}
