package com.cydeo.tests.selfStudies;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TranslantikProject {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://qa.translantik.com");
    }

 /*   @Test
    public void test1Login(){

        String password = "UserUser123";
        String truckDriverUsername = "user10";
//        String storeManagerUsername = "storemanager61";
//        String salesManagerUsername = "salesmanager111";


        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='_username']"));
        usernameInputBox.sendKeys(truckDriverUsername);

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='_password']"));
        passwordInputBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();

        WebElement dropdownUserMenuButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        dropdownUserMenuButton.click();

        WebElement logoutButton = driver.findElement(By.xpath("//a[.='Logout']"));
    //    logoutButton.click();

    }*/

    @Test
    public void test2Login(){

        String password = "UserUser123";
//        String truckDriverUsername = "user10";
        String storeManagerUsername = "storemanager61";
//        String salesManagerUsername = "salesmanager111";


        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='_username']"));
        usernameInputBox.sendKeys(storeManagerUsername);

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='_password']"));
        passwordInputBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();

//        WebElement dropdownUserMenuButton = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
//        dropdownUserMenuButton.click();

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//a[@href='javascript: void(0);']")));
        simpleDropdown.selectByVisibleText("Logout");

        WebElement logoutButton = driver.findElement(By.xpath("//a[.='Logout']"));
    //    logoutButton.click();

    }

/*
    @Test
    public void test3Login(){

        String password = "UserUser123";
//        String truckDriverUsername = "user10";
//        String storeManagerUsername = "storemanager61";
        String salesManagerUsername = "salesmanager111";


        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='_username']"));
        usernameInputBox.sendKeys(salesManagerUsername);

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='_password']"));
        passwordInputBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();

        WebElement dropdownUserMenuButton = driver.findElement(By.xpath("//i[@class='fa-caret-down']"));
        dropdownUserMenuButton.click();

        WebElement logoutButton = driver.findElement(By.xpath("//a[.='Logout']"));
        logoutButton.click();

    }
*/

/*    @Test
    public void test4Logout(){

        WebElement dropdownUserMenuButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        dropdownUserMenuButton.click();

        WebElement logoutButton = driver.findElement(By.xpath("//a[.='Logout']"));
        logoutButton.click();

    }*/


    @AfterMethod
    public void tearDownMethod(){
//        driver.close();
    }





}
