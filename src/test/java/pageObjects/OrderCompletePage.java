package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderCompletePage extends BasePage {

    @FindBy(css = "p.cheque-indent > strong")
    public WebElement orderComplete;

    public String txtOrderComplete() {
        return orderComplete.getText().trim();
    }
}
