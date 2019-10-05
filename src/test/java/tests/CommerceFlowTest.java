package tests;

import io.qameta.allure.*;
import static org.junit.Assert.*;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import utils.Browser;

@Feature("Fluxos de telas do e-commerce")
public class CommerceFlowTest extends BaseTest{

    @Test
    @Story("Acessar a categoria T-SHIRTS")
    public void testAcessarCategoriaTShirts() throws Exception {
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();

        System.out.println("Clicou no menu T-SHIRTS");
        homePage.clickTShirt();

        System.out.println("assertEquals: " + categoryPage.txtCategoryTitle() + " - " + "T-SHIRTS");
        assertEquals(categoryPage.txtCategoryTitle(), "T-SHIRTS" );
    }

    @Test
    @Story("Realizar login")
    public void testRealizarLogin() {
        //init pages
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        //init page factory
        PageFactory.initElements(Browser.getCurrentDriver(), homePage);
        PageFactory.initElements(Browser.getCurrentDriver(), loginPage);
        PageFactory.initElements(Browser.getCurrentDriver(), myAccountPage);


        System.out.println("Clicou no botão Sign in");
        homePage.clickBtnLogin();
        System.out.println("Realizou o Login");
        loginPage.doLogin("novoemailteste@gmail.com", "teste123");

        System.out.println("assertEquals: " + myAccountPage.txtTitlePage() + " - " + "MY ACCOUNT");
        assertEquals(myAccountPage.txtTitlePage(), "MY ACCOUNT");
    }

    @Test
    @Story("Realizar uma compra")
    public void testRealizarUmaCompra() throws Exception {
        //init pages
        CategoryPage categoryPage = new CategoryPage();
        ProductDetailPage productDetailPage = new ProductDetailPage();
        CartPage cartPage = new CartPage();
        AddressCheckoutPage addressCheckoutPage = new AddressCheckoutPage();
        ShippingPage shippingPage = new ShippingPage();
        PaymentTypePage paymentTypePage = new PaymentTypePage();
        PaymentConfirmOrderPage paymentConfirmOrderPage = new PaymentConfirmOrderPage();
        OrderCompletePage orderCompletePage = new OrderCompletePage();

        //init page factory
        PageFactory.initElements(Browser.getCurrentDriver(), cartPage);
        PageFactory.initElements(Browser.getCurrentDriver(), addressCheckoutPage);
        PageFactory.initElements(Browser.getCurrentDriver(), shippingPage);
        PageFactory.initElements(Browser.getCurrentDriver(), paymentTypePage);
        PageFactory.initElements(Browser.getCurrentDriver(), paymentConfirmOrderPage);
        PageFactory.initElements(Browser.getCurrentDriver(), orderCompletePage);

        testRealizarLogin();
        testAcessarCategoriaTShirts();

        System.out.println("Pegou o nome do primeiro produto da categoria: " + categoryPage.txtTitleFirstProduct());
        String nomeProdutoCategoria = categoryPage.txtTitleFirstProduct();

        System.out.println("Clicou no primeiro produto da categoria");
        categoryPage.clickFirstProduct();

        System.out.println("assertEquals: " + nomeProdutoCategoria + " - " + productDetailPage.txtTitleProduct());
        assertEquals(nomeProdutoCategoria, productDetailPage.txtTitleProduct());

        System.out.println("Clicou no botão para adicionar ao carrinho");
        productDetailPage.clickAddToCart();
        System.out.println("Clicou para prosseguir no detalhe do produto");
        productDetailPage.clickProceedToCheckout();
        System.out.println("Clicou para prosseguir na página do carrinho");
        cartPage.clickProceedToCheckout();
        System.out.println("Clicou para prosseguir na página do endereço");
        addressCheckoutPage.clickProceedToCheckout();
        System.out.println("Clicou no checkbox para aceitar os termos");
        shippingPage.clickCheckboxAgreeTerms();
        System.out.println("Clicou para prosseguir na página de frete");
        shippingPage.clickProceedToCheckout();
        System.out.println("Clicou no tipo de pagamento escolhido");
        paymentTypePage.clickBtnPayByBankWire();
        System.out.println("Clicou no botão para confirmar o pedido");
        paymentConfirmOrderPage.clickConfirmOrder();

        System.out.println("assertEquals: " + orderCompletePage.txtOrderComplete() + " - " + "Your order on My Store is complete.");
        assertEquals(orderCompletePage.txtOrderComplete(), "Your order on My Store is complete.");
    }


}
