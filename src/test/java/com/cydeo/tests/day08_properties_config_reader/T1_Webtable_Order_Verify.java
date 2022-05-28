package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Webtable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){


        //Locate the cell that Bob Martin text in it
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        String expectedName = "Bob Martin";
        String actualName = bobMartinCell.getText();

        Assert.assertEquals(expectedName, actualName);


        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        String expectedBobDate = "12/31/2021";
        WebElement bobMartinDataCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        System.out.println("orderDate.getText() = " + bobMartinDataCell.getText());
        String actualBobDate = bobMartinDataCell.getText();

        Assert.assertEquals(expectedBobDate, actualBobDate);

    }

    //We use the utility method that we created
    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver, "Samuel Jackson");

        System.out.println("customerOrderDate1 = " + customerOrderDate1);
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }

    //Using WebTableUtils.orderVerify(); method
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");

    }
}


/*
TC #1: Web table practice
1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021
 */
