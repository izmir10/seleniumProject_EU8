package com.cydeo.tests.day04_findElememnts_checkBoxes_radio;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) {

        //Practice: Checkboxes
        //1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        System.out.println("checkbox1.isSelected(), expecting: false = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checkbox2.isSelected(), expecting: true = " + checkbox2.isSelected());
//        System.out.println("checkbox2.isEnabled() = " + checkbox2.isEnabled());

        //4. Click checkbox #1 to select it.
        //6. Confirm checkbox #1 is SELECTED.
        HandleWait.staticWait(2);
        checkbox1.click();
        System.out.println("checkbox1.isSelected(), expecting: true = " + checkbox1.isSelected());

        //5. Click checkbox #2 to deselect it.
        //7. Confirm checkbox #2 is NOT selected.
        HandleWait.staticWait(2);
        checkbox2.click();
        System.out.println("checkbox2.isSelected(), expecting: false = " + checkbox2.isSelected());

//        if(checkbox1.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }
//        //   7. Confirm checkbox #2 is NOT selected.
//
//        if(!checkbox2.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }


    }
}
