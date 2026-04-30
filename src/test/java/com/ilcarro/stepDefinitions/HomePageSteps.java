package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    HomePage home;
    @Given("User launcher Chrome browser")

    public void user_launcher_Chrome_browser(){
        home= new HomePage(driver);
        home.launchBrowser();
    }
    @When("User opens ilcarro HomePage")

    public void opens_ilcarro_HomePage(){
        home.openUrl();

    }
    @Then("User verifies HomePage title is displayed")
    public void user_verifies_HomePage_title(){
        new HomePage(driver).isHomePageTitleDisplayed();

    }
    @And ("User closes browser")
    public void closeBrowser(){
        new HomePage(driver).closeBrowser();

    }
}
