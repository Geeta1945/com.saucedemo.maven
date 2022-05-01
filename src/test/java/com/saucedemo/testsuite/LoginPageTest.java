package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @Test

    public void userLoginUsingValidCredentials(){

        LoginPage loginPageObj = new LoginPage();
        loginPageObj.enterUsername("standard_user");
        loginPageObj.sendPassword("secret_sauce");
        loginPageObj.clickOnLoginButton();

    }


}
