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

        String actualTitle = homePage.getPageTitle();
        System.out.println("Home Page Title: " + actualTitle);

        Assert.assertTrue(actualTitle.contains("DMI"),
                "Home page title does not contain expected text");
    }
}