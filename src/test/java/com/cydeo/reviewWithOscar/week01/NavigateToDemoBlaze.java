package com.cydeo.reviewWithOscar.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoBlaze {
    public static void main(String[] args) {

        // https://demoblaze.com/index.html
        // Verify Title "STORE"

        // Metaphor: Taxi driver example
        // ==> Taxi is our browser
        // ==> taxiDriver: selenium Webdriver - who can drive this particular car

        WebDriverManager.chromedriver().setup(); // I am setting my taxi driver

        WebDriver driver = new ChromeDriver(); // the car itself - this line opens an empty Chrome web page
        // there is polymorphism here: WebDriver is an interface, ChromeDriver is the concrete class

        driver.get("https://demoblaze.com/index.html");
    //    driver.navigate().to("https://demoblaze.com/index.html");

        String expectedTitle = "STORE"; // Requirements come from the SRS document
        //we have getTitle() method in selenium WebDriver library

        String actualTitle = driver.getTitle();

        // As a tester, without verification/validation what is your value to the Company?
        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Test passed");
        }else{
            System.err.println("Test failed");
        }





    }
}
