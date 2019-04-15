package pageObjects;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data @NoArgsConstructor
public class HomePage extends BasePage {


    public String CLASSSignIn = "login";
    public String TITLETShirt = "T-SHIRTS";


    public WebElement signIn() {
        return driver.findElement(By.className(this.getCLASSSignIn()));
    }

    public WebElement tShirt() {
        return driver.findElement(By.linkText(this.getTITLETShirt()));
    }

    public void clickTShirt() {
        tShirt().click();
    }


    public void clickSignIn() {
        signIn().click();
    }


}
