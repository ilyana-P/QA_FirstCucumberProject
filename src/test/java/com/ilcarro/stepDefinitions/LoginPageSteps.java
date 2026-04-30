package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static com.ilcarro.pages.BasePage.driver;

public class LoginPageSteps {

    LoginPage login;
    @And("User clicks on login link")
    public void click_On_Login_Link(){
        new HomePage(driver).clickOnLoginLink();

    }
    @And("User enters correct data")
    public void User_enters_correct_data(){
        login = new LoginPage(driver);
        login.enterData("test222@gmail.com","Test12345!");
    }
    @And("User clicks on Yalla button")
    public void User_clicks_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("User verifies success message is displayed")
    public void verify_success_message_is_displayed(){
        new LoginPage(driver).verifyMessage("You are logged in success");

    }
    @And("User enters correct email and incorrect password")
    public void enter_wrong_password(DataTable table){
        login= new LoginPage(driver);
        login.enterWrongPassword(table);

    }
    @Then("User verifies error message is displayed")
    public void verifyErrorMessage(){
        login.verifyMessage("Login failed");
    }
}
