package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentConfirmOrderPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'I confirm my order')]")
    public WebElement confirmOrder;

    public void clickConfirmOrder() {
        confirmOrder.click();
    }
}
