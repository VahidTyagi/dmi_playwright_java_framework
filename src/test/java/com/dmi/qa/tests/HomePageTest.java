package com.dmi.qa.tests;

//package com.dmi.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitleTest() {

        HomePage homePage = new HomePage(page);

        homePage.navigateToHomePage();

        String actualTitle = homePage.getPageTitle();
        System.out.println("Page Title is: " + actualTitle);

        Assert.assertTrue(actualTitle.length() > 0,
                "Page title should not be empty");
    }
    
    
    
}

