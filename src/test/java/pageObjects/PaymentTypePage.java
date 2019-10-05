package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentTypePage extends BasePage {

    @FindBy(className = "bankwire")
    public WebElement payByBankWire;

    public void clickBtnPayByBankWire() {
        payByBankWire.click();
    }

}
