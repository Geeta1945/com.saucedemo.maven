package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {

    By productsMessage = By.xpath("//span[@class='title']");
//  after login with valid credentials this method will verify "products" message is displayed
    public String verifyProductsMessage(){

      return  getTextFromElement(productsMessage);

    }

    public void verifyAllProductsDisplayed(){

        //

        List<WebElement> allProductsOnPage = driver.findElements(By.xpath("//div[@class='inventory_item']"));

        int totalProductsOnPAge = allProductsOnPage.size();
        System.out.println(totalProductsOnPAge);

        // I am not sure why it is not printing the

        String productsListArray [] ={"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
        for (WebElement oneProduct: allProductsOnPage   )
        {
            String productFromList = oneProduct.getText();
            int i=0;
            if(productFromList.equalsIgnoreCase(productsListArray[i]) ){

                System.out.println(i + " "+productsListArray[i]);
            }

            else
                {
                    System.out.println("Product not found");

                }
        }




    }



}
