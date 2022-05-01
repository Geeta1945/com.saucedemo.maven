package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ProductsPageTest extends TestBase {

    public LoginPageTest loginPageTestObj = new LoginPageTest();
    public ProductsPage productsPageObj = new ProductsPage();

    @Test

    public void checkProductsMessageDisplayed(){

        loginPageTestObj.userLoginUsingValidCredentials();
        String actualMessage = productsPageObj.verifyProductsMessage();
        Assert.assertEquals("PRODUCTS",actualMessage);
    }

    @Test
    public void checkSixProductsDisplayedOnPage() {

        loginPageTestObj.userLoginUsingValidCredentials();
        productsPageObj.verifyAllProductsDisplayed();

    }

}
