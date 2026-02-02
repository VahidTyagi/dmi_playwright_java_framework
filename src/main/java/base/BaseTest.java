package base;


import com.microsoft.playwright.Page;
import factory.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    protected Page page;
    protected PlaywrightFactory factory;

    @BeforeTest
    public void setUp() {
        factory = new PlaywrightFactory();
        page = factory.initBrowser();
    }

    @AfterTest
    public void tearDown() {
        factory.closeBrowser();
    }
}

