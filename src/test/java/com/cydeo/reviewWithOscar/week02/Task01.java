package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {

        //open chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        WebDriverFactory.getDriver("chrome");

        //go to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        HandleWait.staticWait(1); //we are waiting 1 second

        //then click on "forgot_password" link
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));
        forgotPasswordLink.click();

        //enter any email
        WebElement emailBox = driver.findElement(By.name("email"));

        String expectedEmail = "mike.tyson@garbage.com";
        emailBox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
    //    String actualEmail = emailBox.getText();  // Lets try if we can get it by .getText method ==> It didn't work
    //    System.out.println(actualEmail);  // because it is not a text attribute, it is a value attribute

        String actualEmail = emailBox.getAttribute("value");
        System.out.println(actualEmail);

        if (actualEmail.equals(expectedEmail)){
            System.out.println("Email verification PASSED");
        }else{
            System.out.println("Email verification FAILED!!");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }


        //click on Retrieve password
        //use id
        // driver.findElement(By.id("form_submit")).click();

        //use CSS
        // driver.findElement(By.cssSelector("form_submit")).click();

        //using tagName locator, since it is the only tagName
        // driver.findElement(By.tagName("//button")).click();

        //using xPath
        driver.findElement(By.xpath("//i[contains(text(),'Retrieve password')]")).click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = driver.findElement(By.name("confirmation_message")).getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Confirmation message verification PASSED");
        }else{
            System.out.println("Confirmation message verification FAILED");
        }

        // close or quit the page
        HandleWait.staticWait(1);
        driver.close();

    }
}

/*
    Verify confirmation message
        open chrome browser
        go to https://practice.cydeo.com/
        then click on "forgot_password" link
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'
 */