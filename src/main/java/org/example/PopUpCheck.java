package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PopUpCheck extends Utils{
    private By _searchButton = By.cssSelector("button[type='submit']");

    public void popUpVerify(){
        //clicking on search button without inserting product name in searchbox
        clickOnElement(_searchButton);
        //captureScreenShot("alert");

        //checking alert and its message
        Alert alert = driver.switchTo().alert();
        String actualAlertMessage = driver.switchTo().alert().getText();

        alert.accept();
        String expectedAlertMessage = "Please enter some search keyword";
        Assert.assertEquals(actualAlertMessage,expectedAlertMessage,"Alert Message is not same hence test failed");
    }

}
