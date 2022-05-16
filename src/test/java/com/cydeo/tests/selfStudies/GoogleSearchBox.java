package com.cydeo.tests.selfStudies;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchBox {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");
                                                                //tagName[@attribute='value']
        WebElement cookiesConsent = driver.findElement(By.cssSelector("div[id='L2AGLb'] > div"));
        cookiesConsent.click();




    }
}
