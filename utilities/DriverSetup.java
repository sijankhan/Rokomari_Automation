package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

    private static final ThreadLocal<WebDriver> driver =new ThreadLocal<WebDriver>();

    @BeforeSuite
    public static synchronized void setBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        setDriver(webDriver);
    }

    @AfterSuite
    public static synchronized void quitDriver(){
       // getDriver().quit();
    }
    public static WebDriver getDriver(){
        return driver.get();
    }
    public static void setDriver(WebDriver driver){
        DriverSetup.driver.set(driver);
    }
}
