package pageObjects;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data @NoArgsConstructor
public class MyAccountPage extends BasePage {

    public String CLASSTextInfoMyAccount = "info-account";


    public WebElement textInfoMyAccount() {
        return driver.findElement(By.className(this.getCLASSTextInfoMyAccount()));
    }


    public String getTextInfoMyAccount() {
        return textInfoMyAccount().getText();
    }

}
