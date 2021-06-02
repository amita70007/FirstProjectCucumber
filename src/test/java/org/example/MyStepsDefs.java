package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;


import java.io.IOException;

public class MyStepsDefs {

    HomePage homepage = new HomePage();
    RegisterPage register = new RegisterPage();
    ProductSearch product = new ProductSearch();
    Currency currency = new Currency();
    AddToCart element = new AddToCart();
    NewOnlineStore onlineStore = new NewOnlineStore();
    PopUpCheck popup = new PopUpCheck();
    FacebookLogin facebook = new FacebookLogin();

    public MyStepsDefs() throws IOException {
    }

//*******************Registration page scenario*************************
    @Given("^user is on register page$")
        public void user_is_on_register_page() throws InterruptedException {
            homepage.clickOnRegisterButton();

        }

        @When("^when user enter all registration details$")
        public void when_user_enter_all_registration_details() throws Throwable {
            register.fillRegistrationForm();
        }

        @Then("^user should be able to register successfully$")
        public void user_should_be_able_to_register_successfully() throws Throwable {
            register.registrationSuccessfull();

        }
//********************* add comment scenario **************************************
    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {

    }

    @When("^user enter comment$")
    public void user_enter_comment() throws Throwable {
        onlineStore.enterComment();

    }

    @Then("^user should be able see comment added successfully$")
    public void user_should_be_able_see_comment_added_successfully() throws Throwable {
        onlineStore.commentSuccess();
        onlineStore.verifyAddedComment();

    }

    //***************** Currency change scenario **************************************
    @When("^user change currency from selector menu$")
    public void user_change_currency_from_selector_menu() throws Throwable {

        //verifying currency symbol
        currency.verifyCurrencySymbolFromEachPrice();
        //click on currency field
        currency.clickOnCurrencyField();

    }

    @Then("^user should be able see changed currency successfully$")
    public void user_should_be_able_see_changed_currency_successfully() throws Throwable {

        //verifying currency symbol
        currency.verifyCurrencySymbolFromEachPrice();

    }




}
