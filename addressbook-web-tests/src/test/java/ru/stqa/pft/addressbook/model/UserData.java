package ru.stqa.pft.addressbook.model;

public class UserData {
  private final String firstName;
  private final String middleName;
  private final String secondName;
  private final String nick;
  private final String title;
  private final String company;
  private final String address;
  private final String homePhone;
  private final String mobilePhone;
  private final String workPhone;
  private final String fax;
  private final String firstEmail;
  private final String secondEmail;
  private final String thirdEmail;
  private final String homepage;
  private final String year;
  private final String ayear;
  private final String address2;
  private final String phone2;
  private final String notes;

  public UserData(String firstName, String middleName, String secondName, String nick, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String fax, String firstEmail, String secondEmail, String thirdEmail, String homepage, String year, String ayear, String address2, String phone2, String notes) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.secondName = secondName;
    this.nick = nick;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
    this.fax = fax;
    this.firstEmail = firstEmail;
    this.secondEmail = secondEmail;
    this.thirdEmail = thirdEmail;
    this.homepage = homepage;
    this.year = year;
    this.ayear = ayear;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getSecondName() {
    return secondName;
  }

  public String getNick() {
    return nick;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getFax() {
    return fax;
  }

  public String getFirstEmail() {
    return firstEmail;
  }

  public String getSecondEmail() {
    return secondEmail;
  }

  public String getThirdEmail() {
    return thirdEmail;
  }

  public String getHomepage() {
    return homepage;
  }

  public String getYear() {
    return year;
  }

  public String getAyear() {
    return ayear;
  }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }
}
