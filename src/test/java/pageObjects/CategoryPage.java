package pageObjects;


import io.qameta.allure.Severity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

@Getter @Setter
public class CategoryPage extends BasePage {


    public String CLASSCategoryTitle = "cat-name";

    @FindBy(className = "first-item-of-tablet-line")
    public WebElement firstProduct;

    @FindBy(css = "div.right-block > h5 > a.product-name")
    public WebElement titleFirstProduct;

    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    public WebElement categoryTitle() {
        return driver.findElement(By.className(this.getCLASSCategoryTitle()));
    }

    public String txtCategoryTitle() {
        return categoryTitle().getText().trim();
    }

    public String txtTitleFirstProduct() {
        waitElement("cssSelector", "div.right-block > h5 > a.product-name");
        return titleFirstProduct.getText().trim();
    }

    public void clickFirstProduct() {
        firstProduct.click();
    }

}
