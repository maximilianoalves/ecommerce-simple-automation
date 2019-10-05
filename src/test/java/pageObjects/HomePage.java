package pageObjects;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter @Setter
@NoArgsConstructor
public class HomePage extends BasePage {

    @FindBy(className = "login")
    public WebElement login;
    public String TITLETShirt = "T-SHIRTS";


    public WebElement tShirt() {
        return driver.findElement(By.linkText(this.getTITLETShirt()));
    }

    public void clickTShirt() {
        tShirt().click();
    }

    public void clickBtnLogin() {
        login.click();
    }

}
