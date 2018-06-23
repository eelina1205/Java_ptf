package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationInLibraryTests {
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
  public void testGroupCreationInLibrary() {
    addNewAddress();
    enterFirstName("Yelena");
    enterMiddleName();
    changeFirstName("FirstName");
    changeMiddleName("MiddleName");
    enterLastName("LastName");
    enterNick("NickName");
    enterTitle(new DataForTitle("Title"));
    enterCompany(new DataForCompany("Company"));
    enterAddress(new DataForAddress("Address"));
    enterHome();
    enterHomePhone(new DataForHomePhone("1234567890"));
    enterMobilePhome(new DataForMobilePhone("1234567890"));
    enterWorkPhone(new DataForWorkPhone("1234567890"));
    enterFax(new DataFoFax("1234567890"));
    enter1email(new DataFor1email("email@gmail.com"));
    enter2email(new DataForEmail("email1@gmail.com"));
    enter3email(new DataFor3email("email3@gmail.com"));
    enterHomePage(new DataHomePage("23"));
    enterDate();
    enterMonth();
    enterYear(new DataForAnnYear("2000"));
    selectAnniversaryDate();
    selectAnniversaryMonth();
    selectAnniversaryYear(new DataFotAnniversaryYear("2020"));
    enterSecondAddress(new DataForSecondAddress("Secondary Address"));
    enterSecondHome(new DataForSecondPhone("Home"));
    enterNotes(new DataNotes("Notes"));
    logout();
  }

  private void logout() {
    wd.findElement(By.linkText("Logout")).click();
  }

  private void enterNotes(DataNotes dataNotes) {
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys(dataNotes.getNotes());
  }

  private void enterSecondHome(DataForSecondPhone dataForSecondPhone) {
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys(dataForSecondPhone.getPhoneHome());
  }

  private void enterSecondAddress(DataForSecondAddress dataForSecondAddress) {
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys(dataForSecondAddress.getSecondAdress());
  }

  private void selectAnniversaryYear(DataFotAnniversaryYear dataFotAnniversaryYear) {
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).clear();
    wd.findElement(By.name("ayear")).sendKeys(dataFotAnniversaryYear.getYear());
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

  private void enterYear(DataForAnnYear dataForAnnYear) {
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(dataForAnnYear.getYearAnniv());
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

  private void enterHomePage(DataHomePage dataHomePage) {
    wd.findElement(By.name("homepage")).click();
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys(dataHomePage.getHomeNumber());
  }

  private void enter3email(DataFor3email dataFor3email) {
    wd.findElement(By.name("email3")).click();
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys(dataFor3email.getThirdEmail1());
  }

  private void enter2email(DataForEmail dataForEmail) {
    wd.findElement(By.name("email2")).click();
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys(dataForEmail.getFirstEmail());
  }


  private void enter1email(DataFor1email dataFor1email) {
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(dataFor1email.getEmail());
  }

  private void enterFax(DataFoFax dataFoFax) {
    wd.findElement(By.name("fax")).click();
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys(dataFoFax.getFax());
  }

  private void enterWorkPhone(DataForWorkPhone dataForWorkPhone) {
    wd.findElement(By.name("work")).click();
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(dataForWorkPhone.getWorkinkPhone());
  }

  private void enterMobilePhome(DataForMobilePhone dataForMobilePhone) {
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(dataForMobilePhone.getMobilePhone());
  }

  private void enterHomePhone(DataForHomePhone dataForHomePhone) {
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(dataForHomePhone.getHomePhone());
  }

  private void enterHome() {
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
  }

  private void enterAddress(DataForAddress dataForAddress) {
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(dataForAddress.getAddress());
  }

  private void enterCompany(DataForCompany dataForCompany) {
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(dataForCompany.getCompany());
  }

  private void enterTitle(DataForTitle dataForTitle) {
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(dataForTitle.getTitle());
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
