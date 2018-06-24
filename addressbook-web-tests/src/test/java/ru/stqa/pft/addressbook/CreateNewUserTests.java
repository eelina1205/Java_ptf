package ru.stqa.pft.addressbook;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateNewUserTests extends TestBase {


    @Test
    public void testCreateNewUser() {
        fillForm();
        submitNewUser();
        goToHomePage();
    }

}
