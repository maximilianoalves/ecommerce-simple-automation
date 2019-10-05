package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(css = "h1.page-heading")
    public WebElement titlePage;

    public String txtTitlePage() {
        return titlePage.getText().trim();
    }
}
