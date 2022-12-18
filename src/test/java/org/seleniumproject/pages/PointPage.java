package org.seleniumproject.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumproject.methods.Method;
import org.seleniumproject.pages.ProductPage;
import org.openqa.selenium.By;

import java.util.Random;

import static org.seleniumproject.driver.BaseTest.driver;

public class PointPage {
    Method method;
    Actions action = new Actions(driver);
    public PointPage(){
        method=new Method();
    }

    public void selectPoint(){
        method.click(By.cssSelector("#mainNav .lvl1catalog>a"));
        method.waitBySeconds(1);
        method.click(By.xpath("/html/body/div[5]/div/div/div[2]/div/div[4]/a[2]/img"));
        method.waitBySeconds(1);
        method.selectByText(By.cssSelector(".product-filter-header select"),"Yüksek Oylama");
        method.waitBySeconds(1);
        method.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        method.waitBySeconds(1);
        method.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        method.waitBySeconds(1);
        Random rnd = new Random();
        int random = rnd.nextInt(15)+1;
        System.out.println(random);
        method.click(By.xpath("/html/body/div[5]/div/div[3]/div/div[1]/div/div[2]/ul/li["+random+"]/div/div[3]/div/a/img"));
        method.waitBySeconds(1);
        method.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        method.waitBySeconds(1);
        method.click(By.cssSelector(".menu.top.my-list"));
        method.waitBySeconds(1);
        method.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        method.waitBySeconds(3);



    }
}
