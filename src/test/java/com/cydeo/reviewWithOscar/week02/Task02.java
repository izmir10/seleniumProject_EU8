package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task02 {
    public static void main(String[] args) {

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //- Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //- Verify title equals: String expectedTitle = "Web Orders Login"
        String expectedTitleBeforeLogin = "Web Orders Login";
        String actualTitleBeforeLogin = driver.getTitle();
        // System.out.println(actualTitleBeforeLogin);

        if (expectedTitleBeforeLogin.equals(driver.getTitle())){
            System.out.println("success");
        }else{
            System.exit(-1);
        }

        //- Enter username: Tester
        WebElement userNameBox = driver.findElement(By.id("ctl00_MainContent_username"));
        userNameBox.sendKeys("Tester");
        HandleWait.staticWait(1);

        //- Enter password: test
        WebElement passwordNameBox = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordNameBox.sendKeys("test");
        HandleWait.staticWait(1);

        //- Click “Sign In” button
        WebElement signinButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        signinButton.click();
        HandleWait.staticWait(1);

        //- Verify title equals: String expectedHomePageTitle = "Web Orders"
        String expectedHomePageTitle = "Web Orders";

        if (expectedHomePageTitle.equals(driver.getTitle())){
            System.out.println("Home Page Title validation PASSED");
        }else{
            System.out.println("Home Page Title validation FAILED!!");
        }


        HandleWait.staticWait(2);
        driver.close();


    }
}
/*
@student Basic login authentication
- Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
- Verify title equals: String expectedTitle = "Web Orders Login"
- Enter username: Tester
- Enter password: test
- Click “Sign In” button
- Verify title equals: String expectedHomePageTitle = "Web Orders"
 */