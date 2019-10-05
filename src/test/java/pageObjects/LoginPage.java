package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement fieldEmail;

    @FindBy(id = "passwd")
    public WebElement fieldPasswd;

    @FindBy(id = "SubmitLogin")
    public WebElement submitLogin;

    public void fillFieldEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void fillFieldPasswd(String passwd) {
        fieldPasswd.sendKeys(passwd);
    }

    public void clickSubmitLogin() {
        submitLogin.click();
    }

    public void doLogin(String email, String passwd) {
        fillFieldEmail(email);
        fillFieldPasswd(passwd);
        clickSubmitLogin();
    }
}
