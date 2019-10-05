package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage {

    @FindBy(id = "cgv")
    public WebElement agreeTerms;

    @FindBy(name = "processCarrier")
    public WebElement proceedToCheckout;

    public void clickProceedToCheckout() {
        proceedToCheckout.click();
    }

    public void clickCheckboxAgreeTerms() {
        agreeTerms.click();
    }

}

