package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{

    @BeforeMethod
    public static void openBrowser() {
        driver = new ChromeDriver();
        //type the url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public static void closeBrowser() {
        driver.close();
    }


}
