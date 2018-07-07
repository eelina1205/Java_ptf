package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class loginInCorrect {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openLoginPage();
    }

    private void openLoginPage() {
        wd.get("http://exam.doubleoctopus.com/exam.html");
        wd.findElement(By.cssSelector("button")).click();
    }

    @Test
    public void testloginInCorrect() {
      //Try to login without userName and password (empty fields)
        userName("");
        password("");
        buttonLogin();
        /*Verify user login or not.
        If user login with incorrect value => Text "Submitted Form Data" will be appear at the page => I open a bug
        If not Text not present => test pass
         */
        verifyTextNotPreset();

        //Try to login with userName and without password
        userName("");
        password("123456");
        buttonLogin();
        verifyTextNotPreset();

        //Try to login without userName and with password
        userName("Yelena");
        password("");
        buttonLogin();
        verifyTextNotPreset();


        //!Bugs! I can login without error when i use incorrect input for userName and password
        //Try to login with incorrect input for userName and with password
        userName("1!@W'zмывб檢查");
        password("123456");
        buttonLogin();
        verifyTextNotPreset();

        //Try to login with correct input for userName and incorrect input with password
        userName("Yelena");
        password("1!@W'zмывб檢查");
        buttonLogin();
        verifyTextNotPreset();


    }

    private void verifyTextNotPreset() {
        assertFalse(wd.findElement(By.tagName("html")).getText().contains("Submitted Form Data"));
    }

    private void buttonLogin() {
        wd.findElement(By.xpath("//div[@id='id01']//button[.='Login']")).click();
    }

    private void password(String pswd) {
        wd.findElement(By.name("psw")).click();
        wd.findElement(By.name("psw")).clear();
        wd.findElement(By.name("psw")).sendKeys(pswd);
    }

    private void userName(String userName) {
        wd.findElement(By.name("uname")).click();
        wd.findElement(By.name("uname")).clear();
        wd.findElement(By.name("uname")).sendKeys(userName);
    }
/*
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }*/
}
