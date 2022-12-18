package org.seleniumproject.test;
import org.seleniumproject.pages.LoginPage;
import org.seleniumproject.pages.PointPage;
import org.seleniumproject.driver.BaseTest;
import org.seleniumproject.pages.ProductPage;
import org.junit.Test;

public class PointTest extends BaseTest {
    @Test
    public void pointTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        PointPage pointPage = new PointPage();
        pointPage.selectPoint();
        ProductPage productPage = new ProductPage();
        productPage.removeFav();

    }


}
