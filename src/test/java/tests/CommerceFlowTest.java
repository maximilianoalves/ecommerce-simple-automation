package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.testng.annotations.Test;
import pageObjects.*;

@Feature("Fluxos de telas do e-commerce")
public class CommerceFlowTest extends BaseTest{

    @Test
    @Story("Acessar o detalhe de um produto")
    public void acessarDetalheDoProduto() {
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();

        homePage.clickTShirt();
        Assert.assertEquals("Text should be equal to: ", categoryPage.txtCategoryTitle(), "T-SHIRTS" );
    }
}
