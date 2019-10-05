package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductDetailPage extends BasePage {

    @FindBy(css = "div > h1")
    public WebElement titleProduct;

    @FindBy(xpath = "//span[text() = 'Add to cart']")
    public WebElement addToCart;

    @FindBy(linkText = "Proceed to checkout")
    public WebElement proceedToCheckout;

    public ProductDetailPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String txtTitleProduct() {
        return titleProduct.getText();
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public void clickProceedToCheckout() {
        waitElement("linkText", "Proceed to checkout");
        proceedToCheckout.click();
    }


}
