package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class DriverSetUp {

    public static WebDriver driver;

    @Parameters({"platform","url","browser"})
    @BeforeMethod
    public static WebDriver getLocalDriver(String platform,String url,String browser) {

        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "..\\Generic\\src\\main\\resources\\Driver\\chromedriver");
        }
        else  {
            System.setProperty("webdriver.chrome.driver", "..\\Generic\\src\\main\\resources\\Driver\\chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        return driver;
    }

    @AfterMethod
    public void closeApp(){

    }
}
