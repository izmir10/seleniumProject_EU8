package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification

        WebDriverManager.chromedriver().setup();    //==> Setup for browser driver

        WebDriver driver = new ChromeDriver();      //==> 1.Open Chrome Browser

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");        // ==> 2. Go to "https://www.yahoo.com"

        // ==> 3. Verify the title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo är en del av de varumärken i Yahoo-familjen";
        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)){     // ==> 4. Compare it
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.close();


    }


}
