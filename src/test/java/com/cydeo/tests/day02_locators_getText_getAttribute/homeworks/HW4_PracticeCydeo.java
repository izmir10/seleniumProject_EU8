package com.cydeo.tests.day02_locators_getText_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_PracticeCydeo {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice
        //PS: Locate “Home” link using “className” locator
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

        driver.close();


    }
}

/*
TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator
 */
