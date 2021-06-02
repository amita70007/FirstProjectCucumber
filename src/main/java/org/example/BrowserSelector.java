package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends LoadProperty {
    static String browser;
    public static WebDriver driver;

    public static void setBrowser() throws IOException {
        Properties prop=new Properties();
        FileInputStream ip= new FileInputStream("src\\test\\Resources\\TestData\\config.properties");
        prop.load(ip);
        browser = prop.getProperty("browser");
    /*}
    public static void setBrowserConfig(){*/

        if(browser.equalsIgnoreCase("Chrome")){
            // Chrome browser setting
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox")){
            // Firefox driver setting
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Browser\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("IE")){
            // Defining System Property for the IEDriver
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\Browser\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }
        else if(browser.equalsIgnoreCase("Edge")){
            // Set Edge the driver path
            System.setProperty("webdriver.edge.driver", "src\\test\\Resources\\Browser\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        //setBrowserConfig();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(Url);

    }


}
