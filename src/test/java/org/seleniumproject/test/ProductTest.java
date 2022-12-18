package org.seleniumproject.test;


import org.seleniumproject.driver.BaseTest;
import org.seleniumproject.pages.LoginPage;
import org.seleniumproject.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.selectProduct();



    }

}
