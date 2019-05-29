package com.linkedin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class SignTest extends  BaseTest{
    private static Logger log = Logger.getLogger(SignTest.class.getName());
    private HomePage homePage;
    private SignPage signPage;
    private LesiaPage lesiaPage;

    @Test
    public void testSign(){
        homePage = new HomePage(driver);
       signPage = homePage.clickSignInButton();
       signPage.inputEmailOrPhone(user.getEmailOrPhone());
       signPage.inputPassword(user.getPassword());
       lesiaPage = signPage.clickSignInButton();
       String name = lesiaPage.getName();
       log.info(name);
        Assert.assertEquals("Lesia Metelia", name);
        log.info("Nmae is matched");

    }


}
