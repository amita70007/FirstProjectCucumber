package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class ProductSearch extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private String searchWord1 = loadProperty.getProperty("SearchTerm");
    private By _clickOnRegister = By.linkText("Register");
    private By _currencyName = By.id("customerCurrency");
    private By _listOfPrice = By.xpath("//span[@class='price actual-price']");
    private By _searchTerm = By.id("small-searchterms");
    private By _clickOnSearch = By.xpath("//button[@type='submit']");
    private By _clickOnComputer = By.linkText("Computers");
    private By _clickOnTitle = By.linkText("New online store is open!");
    private By _itemBoxesField = By.className("item-box");
    private By _productNameField = By.cssSelector("h2.product-title");

    public ProductSearch() throws IOException {
    }


    public void productName() throws InterruptedException {


        // search product with name of nike
        enterText(_searchTerm, searchWord1);
        clickOnElement(_clickOnSearch);
        Thread.sleep(2000);
    }
    public void productVerify(){

        //checking all product listed after search
        List<WebElement> products = driver.findElements(_itemBoxesField);
        int count =0 ;
        for (WebElement product : products) {

            if (product.getText().toLowerCase().contains(searchWord1)) {
                count++;
            } else {
                System.out.println("Product does not contain searchTerm is :" + product.getText());
            }
        }

        Assert.assertEquals(count, products.size(), "Nike word should be present in " + products.size() + " but it is present in " + count + "\n");
        System.out.println("searchTerm is present in All product title");
    }



}
