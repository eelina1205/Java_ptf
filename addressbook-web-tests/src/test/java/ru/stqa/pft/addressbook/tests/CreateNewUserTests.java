package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class CreateNewUserTests extends TestBase {


    @Test
    public void testCreateNewUser() {
        app.fillForm();
        app.submitNewUser();
        app.goToHomePage();
    }

}
