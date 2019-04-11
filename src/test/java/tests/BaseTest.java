package tests;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Browser;
import utils.Utils;

public class BaseTest {

    @Before @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
        Browser.loadPage(Utils.getBaseUrl());
    }

    @After @AfterClass
    public void tearDown() {
        Browser.close();
    }
}
