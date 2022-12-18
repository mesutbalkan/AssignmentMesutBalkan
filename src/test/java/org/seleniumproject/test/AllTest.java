package org.seleniumproject.test;

import org.junit.Test;
import org.seleniumproject.driver.BaseTest;
import org.seleniumproject.pages.LoginPage;
import org.seleniumproject.pages.PointPage;
import org.seleniumproject.pages.ProductPage;

public class AllTest extends BaseTest {
    @Test
    public void AllTest(){
        LoginPage loginPage = new LoginPage();
        PointPage pointPage = new PointPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.selectProduct();
        pointPage.selectPoint();
        productPage.removeFav();
        productPage.sepet();

    }


}
