package pageObjects;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data @NoArgsConstructor
public class HomePage extends BasePage {


    public String signIn = "login";


    public WebElement signIn() {
        return driver.findElement(By.className(this.getSignIn()));
    }

    public void clickSignIn() {
        signIn().click();
    }


}
