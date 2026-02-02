package pages;

//package com.dmi.qa.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void navigateToHomePage() {
        page.navigate("https://www.dmifinance.in/");
    }

    public String getPageTitle() {
        return page.title();
    }
}

