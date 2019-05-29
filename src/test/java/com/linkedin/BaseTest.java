package com.linkedin;

import com.linkedin.testData.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static Logger log = Logger.getLogger(BaseTest.class.getName());
    protected User user;

    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lesya/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        String titleExpected = "LinkedIn: Log In or Sign Up";
        String titleActual = driver.getTitle();
        Assert.assertEquals(titleExpected, titleActual);
        log.info("Actual title " + titleActual);

        wait = new WebDriverWait(driver, 10);
        user = new User();



    }

    @After
    public void close(){

    }



}
