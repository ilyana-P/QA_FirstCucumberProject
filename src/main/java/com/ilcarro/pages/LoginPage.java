package com.ilcarro.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[name='username']")
    WebElement inputEmail;
    @FindBy(css = "input[name='password']")
    WebElement inputPassword;

    public LoginPage enterData(String email, String password) {
        type(inputEmail,email);
        type(inputPassword,password);
        return this;
    }

    @FindBy(css="button[type='submit']")
    WebElement yallaButton;

    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;

    }
    @FindBy(css = "h3")
    WebElement messageText;
    public LoginPage verifyMessage(String message) {
        assert shouldHaveText(messageText,message,5);
        return this;
    }

    public LoginPage enterWrongPassword(DataTable table) {
        List<Map<String,String>> dataTable= table.asMaps();

        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        enterData(email,password);
        return this;
    }
}
