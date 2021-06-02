package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _clickOnRegister = By.linkText("Register");
    private By _currencyName = By.id("customerCurrency");
    private By _listOfPrice = By.xpath("//span[@class='price actual-price']");
    private By _searchTerm = By.id("small-searchterms");
    private By _clickOnSearch = By.xpath("//button[@type='submit']");
    private By _clickOnComputer = By.linkText("Computers");
    private By _clickOnTitle = By.linkText("New online store is open!");


    public void openBrowser() throws IOException, InterruptedException {

        System.out.println("launching Web browser");

        //new browser setting
        readProperty();
        setBrowser();



    }
    public void closeBrowser(){
        driver.quit();
    }

    public void clickOnRegisterButton() throws InterruptedException {

        waitForClickable(By.linkText("Register"),20);
        clickOnElement(By.linkText("Register"));
    }


    public void typeInSearchField() throws IOException {   //typing product name
        enterText(_searchTerm, loadProperty.getProperty("searchTerm"));
        //clicking on Search
        clickOnElement(_clickOnSearch);
    }

    public void addToCartButtonShouldBePresent() {   //clicking on product category
        clickOnElement(_clickOnComputer);

    }

    public void commentAddedWithTitleAndComment() {   //clicking on title
        clickOnElement(_clickOnTitle);
    }
}

