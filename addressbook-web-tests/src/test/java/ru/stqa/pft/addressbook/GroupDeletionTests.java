package ru.stqa.pft.addressbook;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
       
        wd.findElement(By.linkText("groups")).click();
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
        wd.findElement(By.name("delete")).click();
        wd.findElement(By.linkText("group page")).click();
    }

}