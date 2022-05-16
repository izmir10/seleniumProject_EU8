package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        String expectedLoginButtonText = "Log In";

        // WebElement signInButton = driver.findElement(By.className("login-btn"));
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String actualLoginButtonText = signInButton.getAttribute("value");

        System.out.println("actualLoginButtonText = " + actualLoginButtonText);

        if (actualLoginButtonText.equals(expectedLoginButtonText)){
            System.out.println("Login button text verification PASSED");
        }else{
            System.out.println("Login button text verification FAILED!!");
        }



    }
}

/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
 */