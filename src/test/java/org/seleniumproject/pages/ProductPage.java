package org.seleniumproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.seleniumproject.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Objects;

import static org.seleniumproject.driver.BaseTest.driver;

public class ProductPage {
    Method method;
    Logger logger = LogManager.getLogger(ProductPage.class);
    String attribute ="";
    String attribute2="";

    public ProductPage() {
        method = new Method();
    }
    public void selectProduct(){
        method.sendKeys(By.xpath("//input[@id='search-input']"),"oyuncak");
        method.click(By.cssSelector(".common-sprite.button-search"));
        method.waitBySeconds(2);
        method.scrollWithAction(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[7]/div[1]/div[1]/div/a/img"));
        method.waitBySeconds(2);
        method.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[1]/div[2]/div[3]/a[4]/i"));
        method.waitBySeconds(1);
        method.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[2]/div[2]/div[3]/a[5]/i"));
        method.waitBySeconds(1);
        method.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[3]/div[2]/div[3]/a[4]/i"));
        method.waitBySeconds(1);
        attribute = method.getAttribute(By.cssSelector("#product-433735>.grid_2.alpha.omega.relative>.hover-menu>.add-to-favorites"),"title");
        logger.info("Alınan text"+attribute);
        System.out.println("Alınan text:"+attribute);
        method.waitBySeconds(1);
        method.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[4]/div[2]/div[3]/a[5]/i"));
        method.waitBySeconds(1);
        method.click(By.cssSelector(".logo-icon"));
        method.waitBySeconds(3);
    }
public void removeFav (){
    /*attribute2 = method.getAttribute(By.cssSelector("#product-433735>div>.name>a"),"title");
    if (Objects.equals(attribute,attribute2)) {
        System.out.println("Eşit");
    } else {
        System.out.println("Eşit değil");
    } */
    method.click(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[2]/div[2]/div[3]/a[3]/i"));
    method.waitBySeconds(2);
}
public void sepet() {

    method.click(By.cssSelector(".heading"));
    method.waitBySeconds(4);
    method.click(By.xpath("//*[@id=\"js-cart\"]"));
    method.waitBySeconds(1);
    method.findElement(By.cssSelector(".js-cart-update-product>input")).clear();
    method.sendKeys(By.cssSelector(".js-cart-update-product>input"),"2");
    method.waitBySeconds(1);
    method.click(By.cssSelector(".buttons>.right"));
    method.waitBySeconds(1);
    method.click(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div/a[2]"));
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#address-firstname-companyname"),"mesut");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#address-lastname-title"),"balkan");
    method.waitBySeconds(1);
    method.selectByText(By.cssSelector("#address-zone-id"),"Adana");
    method.waitBySeconds(1);
    method.selectByText(By.cssSelector("#address-county-id"),"CEYHAN");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#address-address-text"),"kandjkqwndjkqmnwjdklmnasjdknkasmd");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#address-mobile-telephone"),"5358938475");
    method.waitBySeconds(1);
    method.click(By.cssSelector("#button-checkout-continue"));
    method.waitBySeconds(3);
    method.click(By.cssSelector("#button-checkout-continue"));
    method.waitBySeconds(4);
    method.sendKeys(By.cssSelector("#credit-card-owner"),"kandjkqwndjasjdknkasmd");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#credit_card_number_1"),"3232");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#credit_card_number_2"),"4653");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#credit_card_number_3"),"4632");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#credit_card_number_4"),"9866");
    method.waitBySeconds(1);
    method.selectByText(By.cssSelector("#credit-card-expire-date-month"),"03");
    method.waitBySeconds(1);
    method.selectByText(By.cssSelector("#credit-card-expire-date-year"),"2027");
    method.waitBySeconds(1);
    method.sendKeys(By.cssSelector("#credit-card-security-code"),"986");
    method.waitBySeconds(1);
    method.click(By.cssSelector("#button-checkout-continue"));
    method.waitBySeconds(1);
    method.click(By.cssSelector(".checkout-logo"));
    method.waitBySeconds(3);
    WebElement element = driver.findElement(By.cssSelector(".menu.top.login"));
    Actions action  = new Actions(driver);
    action.moveToElement(element).perform();
    method.waitBySeconds(1);
    method.click(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
    method.waitBySeconds(3);







    }


}

