package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
        super(driver);
    }
    @FindBy(css = "a.nav__button-secondary")
    private WebElement signInButton;


    public SignPage clickSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
        return new SignPage(driver);
    }



}
