package org.example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserManager extends Util{

    public static LoadProperty loadProperty=new LoadProperty();
    public static String browser = loadProperty.getProperty("Browser");

    public  void setUpBrowser() {
        System.out.println(browser);
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("here");
            //setting up chromedriver path
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
            //creating chromdriver object to open google chrome browser
            driver = new ChromeDriver();
            System.out.println(loadProperty.getProperty("url"));

        } else if (browser.equalsIgnoreCase("firefox")) {
            //setting up firefox path
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
            //Now you can Initialize marionette driver to launch firefox
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            //creating firefox object to open firefox browser
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            //setting up ie path
            System.setProperty("webdriver.IEDriverServer.driver", "src\\test\\resources\\BrowserDrivers\\IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability("ignoreZoomSetting", true);
            //creating ie object to open ie browser
            driver = new InternetExplorerDriver();
        }
        else{
            System.out.println("please enter valid browser");
        }


        //maximising screen
        driver.manage().window().maximize();
        //applying implicity wait of 30 sec to the driver instance
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //open the URL
        driver.get(loadProperty.getProperty("url"));

    }
    public  void closeBrowser() {
    driver.close();
} //reusable method to close browser
}
