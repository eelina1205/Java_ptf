package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

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
    userName("Yelena");
    password("Korsakova");
    rememberMe();
    buttonLogin();
    verifyUserDataUserLogin();
  }

  private void verifyUserDataUserLogin() {
    if (!wd.findElement(By.tagName("html")).getText().contains("uname=Yelena&psw=Korsakova")) {
    }
  }

  private void buttonLogin() {
    wd.findElement(By.xpath("//div[@id='id01']//button[.='Login']")).click();
  }

  private void rememberMe() {
    //remember me
    wd.findElement(By.cssSelector("div.container")).click();
    if (wd.findElement(By.name("remember")).isSelected()) {
      wd.findElement(By.name("remember")).click();
    }
  }

  private void password(String userName) {
    wd.findElement(By.name("psw")).click();
    wd.findElement(By.name("psw")).clear();
    wd.findElement(By.name("psw")).sendKeys(userName);
  }

  private void userName(String pswd) {
    wd.findElement(By.name("uname")).click();
    wd.findElement(By.name("uname")).clear();
    wd.findElement(By.name("uname")).sendKeys(pswd);
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
