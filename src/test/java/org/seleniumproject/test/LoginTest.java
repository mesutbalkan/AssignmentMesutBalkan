package org.seleniumproject.test;


import org.seleniumproject.driver.BaseTest;
import org.seleniumproject.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
