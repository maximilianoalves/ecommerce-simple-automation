package pageObjects;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data @NoArgsConstructor
public class SignInPage extends BasePage {

    public String IDEmailCreate = "email_create";
    public String IDSubmitCreate = "SubmitCreate";


    public WebElement inputEmailCreate() {
        return driver.findElement(By.id(this.getIDEmailCreate()));
    }

    public WebElement btnSubmitCreate() {
        return driver.findElement(By.id(this.getIDSubmitCreate()));
    }

    public void fillInputEmail() {
        inputEmailCreate().sendKeys(faker.internet().emailAddress());
    }

    public void clickBtnSubmitCreate() {
        btnSubmitCreate().click();
    }


}
