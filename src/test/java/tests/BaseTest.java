package tests;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utils.Browser;
import utils.Utils;

public class BaseTest {

    @BeforeTest
    public void setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }

    @AfterTest
    public void tearDown() {
        Browser.close();
    }
}
