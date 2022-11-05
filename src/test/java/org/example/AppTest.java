package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test123() throws MalformedURLException {
        MutableCapabilities dc;

        dc = new ChromeOptions();

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.68.102:4444/wd/hub"), dc);

        driver.get("https://google.com.vn");

        driver.quit();
    }
}
