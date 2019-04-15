package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.*;

public class CommerceFlowTest extends BaseTest{

    @Test @org.testng.annotations.Test
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

    @org.testng.annotations.Test
    public void acessarDetalheDoProduto() {
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();

        homePage.clickTShirt();
        Assert.assertEquals("Text should be equal to: ", categoryPage.txtCategoryTitle(), "T-SHIRTS" );


    }




}
