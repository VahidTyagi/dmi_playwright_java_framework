package factory;

//package com.dmi.qa.factory;

import java.util.Properties;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    public Page initBrowser(Properties prop) {

        String browserName = prop.getProperty("browser").trim();
        boolean headless = Boolean.parseBoolean(prop.getProperty("headless"));

        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(headless));
                break;

            case "firefox":
                browser = playwright.firefox().launch(
                        new BrowserType.LaunchOptions().setHeadless(headless));
                break;

            case "webkit":
                browser = playwright.webkit().launch(
                        new BrowserType.LaunchOptions().setHeadless(headless));
                break;

            default:
                throw new RuntimeException("Browser not supported: " + browserName);
        }

        context = browser.newContext();
        page = context.newPage();

        return page;
    }

    public void closeBrowser() {
        playwright.close();
    }
}
