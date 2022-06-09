package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
<<<<<<< HEAD
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
=======
>>>>>>> origin/master
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

<<<<<<< HEAD
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }

    @AfterMethod
    public void teardownMethod(){
        Driver.closeDriver();
    }

=======
>>>>>>> origin/master
    @Test
    public void required_field_error_message_test(){

        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
<<<<<<< HEAD


        //3- Do not enter any information
        //4- Click to “Sign in” button

=======
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage = new LibraryLoginPage();
>>>>>>> origin/master
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required
<<<<<<< HEAD

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());


=======
        String expectedErrorMessage = "This field is required.";
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
>>>>>>> origin/master

    }

    @Test
    public void invalid_email_format_error_message_test(){
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
<<<<<<< HEAD

        //3- Enter invalid email format

        libraryLoginPage.inputUsername.sendKeys("invalid");
=======
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Enter invalid email format
        libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.inputUsername.sendKeys("tempmail.email.com");
>>>>>>> origin/master
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

<<<<<<< HEAD
    }

    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Enter incorrect username or incorrect password

        libraryLoginPage.inputUsername.sendKeys("invalid@email.com");
        libraryLoginPage.inputPassword.sendKeys("invalid");

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
=======
        Driver.closeDriver();
>>>>>>> origin/master

    }



}
