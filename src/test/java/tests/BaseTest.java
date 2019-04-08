package tests;

import org.junit.After;
import org.junit.Before;
import utils.Browser;
import utils.Utils;

public class BaseTest {

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
        Browser.loadPage(Utils.getBaseUrl());
    }

    @After
    public void tearDown() {
        Browser.close();
    }
}
