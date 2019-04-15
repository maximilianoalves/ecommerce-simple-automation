package pageObjects;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data
@NoArgsConstructor
public class CategoryPage extends BasePage {

    public String CLASSCategoryTitle = "cat-name";


    public WebElement categoryTitle() {
        return driver.findElement(By.className(this.getCLASSCategoryTitle()));
    }

    public String txtCategoryTitle() {
        return categoryTitle().getText().trim();
    }

}
