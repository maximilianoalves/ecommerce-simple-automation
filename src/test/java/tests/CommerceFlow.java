package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.SignInPage;
import utils.Browser;
import utils.Utils;

public class CommerceFlow extends BaseTest{

    @Test
    public void registerUser() throws InterruptedException {
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        CreateAccountPage createAccount = new CreateAccountPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        homePage.clickSignIn();
        signInPage.fillInputEmail();
        signInPage.clickBtnSubmitCreate();
        createAccount.fastFillInputForm();
        Assert.assertEquals("Text shold be equal to: ", myAccountPage.getTextInfoMyAccount(), "Welcome to your account. Here you can manage all of your personal information and orders.");

    }

}
