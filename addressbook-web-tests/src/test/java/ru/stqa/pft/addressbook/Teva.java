package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class Teva {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));

    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }


  @Test
  public void testTeva() {
    wd.get("http://www.tevapharm.com/about/profile/");
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("About")));
    wd.findElement(By.linkText("Company Profile")).click();
    wd.findElement(By.linkText("Corporate Officers")).click();
    wd.findElement(By.linkText("Corporate Governance")).click();
    wd.findElement(By.linkText("Board of Directors")).click();
    wd.findElement(By.linkText("Our History")).click();
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("Products")));
    wd.findElement(By.linkText("API")).click();
    wd.findElement(By.linkText("Specialty")).click();
    wd.findElement(By.linkText("Generic FAQ")).click();
    wd.findElement(By.linkText("Over the Counter (OTC)")).click();
    wd.findElement(By.linkText("Generic Products")).click();
    wd.findElement(By.linkText("Products")).click();
    wd.findElement(By.linkText("Products")).click();
    wd.findElement(By.xpath("//li[@id='ctlPageContentPlaceHeader_ctl01_ctl00_ctl00_ctlLi_1']/div/div/ul[2]/li[3]/a")).click();
    wd.findElement(By.linkText("Quality")).click();
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("Research")));
    wd.findElement(By.linkText("Integrated R&D")).click();
    wd.findElement(By.linkText("Our Focus")).click();
    wd.findElement(By.linkText("Patient Promise")).click();
    wd.findElement(By.linkText("Pipeline")).click();
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("Responsibility")));
    wd.findElement(By.linkText("Social Impact")).click();
    wd.findElement(By.linkText("Positions & Policies")).click();
    wd.findElement(By.linkText("Patient Advocacy")).click();
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("Media")));
    wd.findElement(By.linkText("Latest News")).click();
    wd.findElement(By.linkText("Featured Stories")).click();
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("Careers")));
    wd.findElement(By.linkText("Dare to be different")).click();
    wd.findElement(By.linkText("Our Guiding Values")).click();
    wd.findElement(By.linkText("Leadership Development")).click();
    wd.findElement(By.linkText("Working at Teva")).click();
    new Actions(wd).clickAndHold(wd.findElement(By.linkText("Investors")));
        /*wd.findElement(By.linkText("News")).click();
        wd.findElement(By.linkText("Webcast and Presentations")).click();
        wd.findElement(By.linkText("Featured Stories")).click();
        wd.findElement(By.linkText("Corporate Governance")).click();
        wd.findElement(By.linkText("Financial Information")).click();
        wd.findElement(By.linkText("Stock Information")).click();
        wd.findElement(By.linkText("Shareholder Information")).click();
        wd.findElement(By.linkText("Analysts Coverage/Consensus")).click();
        wd.findElement(By.linkText("Investor Kit")).click();
        wd.findElement(By.linkText("Contact Us")).click();
*/

  }

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
  }
}
