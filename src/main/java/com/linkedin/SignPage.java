package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignPage extends BasePage {
    public SignPage(WebDriver driver){
        super(driver);
    }


    @FindBy(css = "#username")
    private WebElement emailOrPhoneField;


    @FindBy(css = "#password")
    private WebElement passwordField;


    @FindBy(css = ".btn__primary--large.from__button--floating")
    private WebElement signInButton;


    public void inputEmailOrPhone(String emailOrPhone){
        wait.until(ExpectedConditions.visibilityOf(emailOrPhoneField));
        emailOrPhoneField.sendKeys(emailOrPhone);

    }

    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);
    }

    public LesiaPage clickSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
        return new LesiaPage(driver);
    }

}
