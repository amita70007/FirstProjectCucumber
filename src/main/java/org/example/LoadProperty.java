package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    static String fileName = "config.properties";
    static String fileLocation = "src/test/resources/TestData/config.properties";
    static String browser;
    static WebDriver driver;
    public static String FirstName;
    public static String LastName;
    static String DateOfBirthDay;
    static String DateOfBirthMonth;
    static String DateOfBirthYear;
    static String Company;
    static String Password;
    static String Url;
    static String title;
    static String comment;

    public String getProperty(String keyName) throws IOException {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation);
            //input = new FileInputStream(fileLocation +fileName);
            prop.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }
        public static void readProperty() throws IOException {
            Properties prop = new Properties();
            //FileInputStream ip = new FileInputStream("src\\test\\Resources\\TestData\\config.properties");
            FileInputStream ip = new FileInputStream(fileLocation);

            prop.load(ip);
            FirstName = prop.getProperty("FirstName");
            LastName = prop.getProperty("LastName");
            DateOfBirthDay = prop.getProperty("DateOfBirthDay");
            DateOfBirthMonth = prop.getProperty("DateOfBirthMonth");
            DateOfBirthYear = prop.getProperty("DateOfBirthYear");
            Company = prop.getProperty("Company");
            Password = prop.getProperty("Password");
            Url = prop.getProperty("url");
            title = prop.getProperty("Comment_Title");
            comment = prop.getProperty("Comments_Text");


        }

    }
