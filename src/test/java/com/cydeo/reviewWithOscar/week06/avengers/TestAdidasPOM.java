package com.cydeo.reviewWithOscar.week06.avengers;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestAdidasPOM {

    @Test
    public void Test(){
        /*
        Navigate to home page
        click Laptops, and assert that the list of Laptops match expected
         */

        Driver.getDriver().get("https://www.demoblaze.com/index.html");

        // create object for POM locators and methods
        ProductPage page = new ProductPage();
        page.getLink("Laptops");

        List<String> expectedProducts = new ArrayList<>();
        expectedProducts.addAll(Arrays.asList("Sony vaio i5","Sony vaio i7","MacBook air",       "Dell i7 8gb","2017 Dell 15.6 Inch","MacBook Pro"));

        Collections.sort(expectedProducts);
/*
        List<WebElement> products = page.products;
        for (WebElement product : products) {
            System.out.println(product.getText());
        }
*/

        List<String> actualProducts = ReviewUtils.getElementsTexts(page.products);
        Collections.sort(actualProducts);

        Assert.assertEquals(actualProducts, expectedProducts);


        Driver.closeDriver();



    }

    @Test
    public void Test2(){

    }

}