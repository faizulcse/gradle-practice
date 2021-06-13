package testcases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SetupTest {
    public static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "/driver/chromedriver");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com");
    }

    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
