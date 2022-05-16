package com.cydeo.tests.day02_locators_getText_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_ETSY_Task {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        WebElement agreeButton=driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button"));
        agreeButton.click();
        Thread.sleep(3000);

        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        //System.out.println(searchBox.getAttribute("placeholder")); //==> Search for anything
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

         driver.close();

    }
}

/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */