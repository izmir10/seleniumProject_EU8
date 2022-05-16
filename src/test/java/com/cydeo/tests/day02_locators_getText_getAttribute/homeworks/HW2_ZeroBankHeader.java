package com.cydeo.tests.day02_locators_getText_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_ZeroBankHeader {
    public static void main(String[] args) {
        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement headerText = driver.findElement(By.tagName("h3"));
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();
        //System.out.println(actualHeaderText);
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text verification PASSED!");
        } else {
            System.out.println("Header Text verification FAILED!!!");
        }

        driver.close();
    }
}

/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */