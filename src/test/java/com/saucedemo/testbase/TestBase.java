package com.saucedemo.testbase;

import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    // set up browser
    String browser = "chrome";

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);

    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();

    }
}
