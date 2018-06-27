package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.UserData;

public class GroupHelper extends HelperBase {

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {

    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void fillForm() {
      fillForm(new UserData("Yelena", "Yelina", "Korsakova", "Y.K.", "Test", "Book.com", "Minsk", "1234567890", "1234567890", "1234567890", "1234567890", "email@gmail.com", "email2@gmail.com", "email3@gmail.com", "https://www.book.com", "2000", "2020", "Minsk2", "1234", "No notes"));
  }

  public void goToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitNewUser() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  private void fillForm(UserData userData) {
    click(By.linkText("add new"));
    type(By.name("firstname"), userData.getFirstName());
    type(By.name("middlename"), userData.getMiddleName());
    type(By.name("lastname"), userData.getSecondName());
    type(By.name("nickname"), userData.getNick());
    type(By.name("title"), userData.getTitle());
    type(By.name("company"), userData.getCompany());
    type(By.name("address"), userData.getAddress());
    type(By.name("home"), userData.getHomePhone());
    click(By.name("mobile"));
    type(By.name("mobile"), userData.getMobilePhone());
    type(By.name("work"), userData.getWorkPhone());
    type(By.name("fax"), userData.getFax());
    type(By.name("email"), userData.getFirstEmail());
    type(By.name("email2"), userData.getSecondEmail());
    type(By.name("email3"), userData.getThirdEmail());
    type(By.name("homepage"), userData.getHomepage());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[2]"));
      }
    type(By.name("byear"), userData.getYear());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[4]//option[2]"));
      }
    type(By.name("ayear"), userData.getAyear());
    type(By.name("address2"), userData.getAddress2());
    type(By.name("phone2"), userData.getPhone2());
    type(By.name("notes"), userData.getNotes());
  }

  public void deleteSelectedGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
