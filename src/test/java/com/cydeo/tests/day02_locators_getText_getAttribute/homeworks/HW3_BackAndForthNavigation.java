package com.cydeo.tests.day02_locators_getText_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackAndForthNavigation {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        //3- Click to Gmail from top right.
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        actualTitle = driver.getTitle();
        expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title2 verification PASSED!");
        } else {
            System.out.println("Title2 verification FAILED!");
        }

        driver.close();

    }
}

/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
