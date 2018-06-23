package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateNewUserTests {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/edit.php");
    login("admin", "secret");
  }

  private void login(String user, String password) {
    wd.findElement(By.id("LoginForm")).click();
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(user);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }


  @Test
  public void testCreateNewUser() {
    addNewAddress();
    enterFirstName("Yelena");
    enterMiddleName();
    changeFirstName("FirstName");
    changeMiddleName("MiddleName");
    enterLastName("LastName");
    enterNick("NickName");
    enterTitle("Title");
    enterCompany("Company");
    enterAddress("Address");
    enterHome();
    enterHomePhone("1234567890");
    enterMobilePhome("1234567890");
    enterWorkPhone("1234567890");
    enterFax("1234567890");
    enter1email("email@gmail.com");
    enter2email("email1@gmail.com");
    enter3email("email3@gmail.com");
    enterHomePage("23");
    enterDate();
    enterMonth();
    enterYear("2000");
    selectAnniversaryDate();
    selectAnniversaryMonth();
    selectAnniversaryYear("2020");
    enterSecondAddress("Secondary Address");
    enterSecondHome("Home");
    enterNotes("Notes");
    logout();
  }

  private void logout() {
    wd.findElement(By.linkText("Logout")).click();
  }

  private void enterNotes(String notes) {
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys(notes);
  }

  private void enterSecondHome(String phoneHome) {
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys(phoneHome);
  }

  private void enterSecondAddress(String secondAdress) {
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys(secondAdress);
  }

  private void selectAnniversaryYear(String year) {
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).clear();
    wd.findElement(By.name("ayear")).sendKeys(year);
  }

  private void selectAnniversaryMonth() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[13]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[13]")).click();
    }
  }

  private void selectAnniversaryDate() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[14]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[14]")).click();
    }
  }

  private void enterYear(String yearAnniv) {
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(yearAnniv);
  }

  private void enterMonth() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[11]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[11]")).click();
    }
  }

  private void enterDate() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[17]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[17]")).click();
    }
  }

  private void enterHomePage(String homeNumber) {
    wd.findElement(By.name("homepage")).click();
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys(homeNumber);
  }

  private void enter3email(String thirdEmail1) {
    wd.findElement(By.name("email3")).click();
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys(thirdEmail1);
  }

  private void enter2email(String firstEmail) {
    wd.findElement(By.name("email2")).click();
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys(firstEmail);
  }


  private void enter1email(String email) {
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(email);
  }

  private void enterFax(String fax) {
    wd.findElement(By.name("fax")).click();
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys(fax);
  }

  private void enterWorkPhone(String workinkPhone) {
    wd.findElement(By.name("work")).click();
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(workinkPhone);
  }

  private void enterMobilePhome(String mobilePhone) {
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(mobilePhone);
  }

  private void enterHomePhone(String homePhone) {
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(homePhone);
  }

  private void enterHome() {
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
  }

  private void enterAddress(String address) {
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(address);
  }

  private void enterCompany(String company) {
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(company);
  }

  private void enterTitle(String title) {
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(title);
  }

  private void enterNick(String nick) {
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(nick);
  }

  private void enterLastName(String lastName) {
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(lastName);
  }

  private void changeMiddleName(String middleName) {
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(middleName);
  }

  private void changeFirstName(String firstName) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(firstName);
  }

  private void enterMiddleName() {
    wd.findElement(By.name("middlename")).click();
  }

  private void enterFirstName(String firstName1) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(firstName1);
  }

  private void addNewAddress() {
    wd.findElement(By.linkText("add new")).click();
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
