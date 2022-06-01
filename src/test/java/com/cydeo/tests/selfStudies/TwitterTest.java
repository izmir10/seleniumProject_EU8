package com.cydeo.tests.selfStudies;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TwitterTest {

    @Test
    public void google_search_test(){
        //Driver.getDriver() --> driver

        Driver.getDriver().get("https://twitter.com/");


        WebElement acceptCookies = Driver.getDriver().findElement(By.xpath("//span [.='Accept all cookies']"));
        acceptCookies.click();

        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span [.='Sign in']"));
        signIn.click();

        WebElement logInUsername = Driver.getDriver().findElement(By.xpath("//input[@autocomplete='username']"));
        logInUsername.sendKeys("krdlnx1");

        WebElement nextButton = Driver.getDriver().findElement(By.xpath("//span[.='Next']"));
        nextButton.click();

        WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("xxxx");

        WebElement login2 = Driver.getDriver().findElement(By.xpath("//span[.='Log in']"));
        login2.click();









    }

}
