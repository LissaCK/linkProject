package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LesiaPage extends BasePage {
    public LesiaPage (WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#ember101 > span")
    private WebElement nameVerification;

    public String getName(){
        wait.until(ExpectedConditions.visibilityOf(nameVerification));
        String name = nameVerification.getText();
        return name;
    }


}
