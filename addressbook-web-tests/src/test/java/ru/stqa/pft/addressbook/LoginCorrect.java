package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import static org.openqa.selenium.OutputType.*;

public class LoginCorrect {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    openLoginPage();

  }

  private void openLoginPage() {
    //open page
    wd.get("http://exam.doubleoctopus.com/exam.html");
    //click on button Login
    wd.findElement(By.cssSelector("button")).click();
  }

  @Test
  public void testLoginCorrect() {

    userName();
    password();
    //remember me
    wd.findElement(By.cssSelector("div.container")).click();
    if (wd.findElement(By.name("remember")).isSelected()) {
      wd.findElement(By.name("remember")).click();
    }
    wd.findElement(By.xpath("//div[@id='id01']//button[.='Login']")).click();
    if (!wd.findElement(By.tagName("html")).getText().contains("uname=Yelena&psw=Korsakova")) {
    }

  }

  private void password() {
    wd.findElement(By.name("psw")).click();
    wd.findElement(By.name("psw")).clear();
    wd.findElement(By.name("psw")).sendKeys("Korsakova");
  }

  private void userName() {
    wd.findElement(By.name("uname")).click();
    wd.findElement(By.name("uname")).clear();
    wd.findElement(By.name("uname")).sendKeys("Yelena");
  }


 /*  @AfterMethod
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
    }
*/
}
