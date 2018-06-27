package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase {


    @Test
    public void testCreateNewUser() {
        app.getGroupHelper().fillForm();
        app.getGroupHelper().submitNewUser();
        app.getGroupHelper().goToHomePage();
    }

}
