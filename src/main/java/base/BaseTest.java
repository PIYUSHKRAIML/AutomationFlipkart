package base;

import utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    /*@AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}
