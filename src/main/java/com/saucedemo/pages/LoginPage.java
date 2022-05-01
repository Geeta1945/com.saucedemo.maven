package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By loginButton =By.xpath("//input[@id='login-button']");


    public void enterUsername(String userName){

        sendTextToElement(username,userName);
    }

    public void sendPassword(String enterPassword)
    {
     sendTextToElement(password,enterPassword);
    }

    public void clickOnLoginButton(){

        mouseHoverToElementAndClick(loginButton);
    }





}
