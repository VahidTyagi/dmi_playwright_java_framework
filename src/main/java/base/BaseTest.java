package base;



import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import factory.PlaywrightFactory;
import utils.ConfigReader;
import com.microsoft.playwright.Page;

public class BaseTest {

    protected Page page;
    protected Properties prop;
    protected PlaywrightFactory factory;

    @BeforeTest
    public void setUp() {

        ConfigReader configReader = new ConfigReader();
        prop = configReader.initProperties();

        factory = new PlaywrightFactory();
        page = factory.initBrowser(prop);

        page.navigate(prop.getProperty("url"));
    }

    @AfterTest
    public void tearDown() {
        factory.closeBrowser();
    }
}
