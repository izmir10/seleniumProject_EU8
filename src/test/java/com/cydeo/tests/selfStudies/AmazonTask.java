package com.cydeo.tests.selfStudies;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonTask {

    @Test
    public void amazonTask01(){

        //1.	Go to https://www.amazon.com
        Driver.getDriver().get("https://www.amazon.com");

        //2.	Search for "hats for men" (Call from Configuration.properties file)
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("hats for men");
        WebElement searchButton = Driver.getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();

        //3.	Add the first hat appearing to Cart with quantity 2
        //4.	Open cart and assert that the total price and quantity are correct
        //5.	Reduce the quantity from 2 to 1 in Cart for the item selected in the step 3
        //6.	Assert that the total price and quantity has been correctly changed




    }

}
