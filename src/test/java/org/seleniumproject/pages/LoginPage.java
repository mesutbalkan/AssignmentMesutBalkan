package org.seleniumproject.pages;

import org.seleniumproject.methods.Method;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Method method;
    public LoginPage(){
        method=new Method();
    }
    public  void login(){
        method.click(By.cssSelector(".menu-top-button.login>a"));
        method.waitBySeconds(2);
        method.sendKeys(By.cssSelector("#login-email"),"mesutt.balkan@gmail.com");
        method.waitBySeconds(2);
        method.sendKeys(By.xpath("//input[@id='login-password']"),"mesut123");
        method.waitBySeconds(2);
        method.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        method.waitBySeconds(2);
        Assert.assertTrue(method.isElementVisible(By.cssSelector(".section")));

        method.waitBySeconds(2);
    }

}
