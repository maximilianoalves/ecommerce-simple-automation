package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.testng.annotations.Test;
import pageObjects.*;

@Feature("Fluxos de telas do e-commerce")
public class CommerceFlowTest extends BaseTest{

    @Test
    @Story("Registrar um usuário")
    public void registerUser() {
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        CreateAccountPage createAccount = new CreateAccountPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        homePage.clickSignIn();
        signInPage.fillInputEmail();
        signInPage.clickBtnSubmitCreate();
        createAccount.fastFillInputForm();
        Assert.assertEquals("Text should be equal to: ", myAccountPage.getTextInfoMyAccount(), "Welcome to your account. Here you can manage all of your personal information and orders.");
    }

    @Test
    @Story("Acessar o detalhe de um produto")
    public void acessarDetalheDoProduto() {
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();

        homePage.clickTShirt();
        Assert.assertEquals("Text should be equal to: ", categoryPage.txtCategoryTitle(), "T-SHIRTS" );
    }
}
