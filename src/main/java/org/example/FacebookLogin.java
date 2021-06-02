package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class FacebookLogin extends Utils{
    private By _facebookLink = By.cssSelector("li[class='facebook']");
    private By _longinButton = By.xpath("//label[@id='loginbutton']");
    private By _cookies_accept = By.xpath("//button[@class='_42ft _4jy0 _9o-t _4jy3 _4jy1 selected _51sy']");

    public void facebookLoginButtonVerify() throws InterruptedException {
        //clicking on facebook link on homepage
        clickOnElement(_facebookLink);

        //switching to new tab opened for facebook login
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        System.out.println("no of tabs found :"+ tabs.size());
        driver.switchTo().window((String) tabs.get(1));

        //accepting cookies
        waitForClickable(_cookies_accept, 15);
        clickOnElement(_cookies_accept);
        //captureScreenShot("facebook");

        //checking and verifying login button present
        Assert.assertTrue(driver.findElement(_longinButton).isDisplayed(), "Log-in button is not present");
        System.out.println("Login button is present");

        driver.switchTo().defaultContent();
        //Thread.sleep(2000);


    }

}
