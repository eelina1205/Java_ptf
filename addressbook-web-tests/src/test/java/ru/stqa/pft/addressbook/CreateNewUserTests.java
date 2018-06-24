package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase {


    @Test
    public void testCreateNewUser() {
        fillForm();
        submitNewUser();
        goToHomePage();
    }

}
