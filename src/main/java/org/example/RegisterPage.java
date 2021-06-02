package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

public class RegisterPage extends Utils{
    LoadProperty loadProperty = new LoadProperty();
    private By _radioButtonMale = By.id("gender-male");
    private By _firstName = By.xpath("//input[@id='FirstName']");
    private By _lastName = By.xpath("//input[@id='LastName']");
    private By _dateOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _email = By.xpath("//input[@id='Email']");
    private By _companyName = By.name("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegister = By.id("register-button");
    private By _actualResult = By.xpath("//div[@class='result']");


    public void fillRegistrationForm() throws InterruptedException, IOException {
        readProperty();

        // click gender
        Thread.sleep(2000);

        clickOnElement(_radioButtonMale);

        // fill first name and last name
        Thread.sleep(2000);
        //waitForClickable(By.xpath("//input[@id='FirstName']"),2000);
        enterText(_firstName,FirstName);
        Thread.sleep(2000);
        //waitForClickable(By.xpath("//input[@id='FirstName']"),1000);
        enterText(_lastName,LastName);

        //Dropdown menu DOB selection
        selectFromDropdownByVisibleText(_dateOfBirth,DateOfBirthDay);
        selectFromDropdownByVisibleText(_monthOfBirth,DateOfBirthMonth);
        selectFromDropdownByVisibleText(_yearOfBirth,DateOfBirthYear);


        //email address input
        enterText(_email,"testing"+timestamp.getTime()+"@test.com");

        //enter company name
        enterText(_companyName,Company);

        //newsleter selection
        clickOnElement(By.id("Newsletter"));

        //fill out the password input box
        enterText(_password,Password);
        enterText(_confirmPassword,Password);

        //click on register button
        waitForClickable(_clickOnRegister,2000);
        clickOnElement(_clickOnRegister);

    }

    public void registrationSuccessfull(){
        String expectedTitleText = "Your registration completed";
        String titleTextActual = getTextFromElement(_actualResult);
        //System.out.println(titleTextActual);
        Assert.assertEquals(titleTextActual,expectedTitleText, "Your test case is failed");



    }


}
