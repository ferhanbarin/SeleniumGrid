package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    public static void main(String[] args) throws MalformedURLException {

        // 1) Desired Capabilities olusturun.
        DesiredCapabilities capabilities = new DesiredCapabilities();


        // Desired Capabilities icerisinde 3 sey tanimlayabiliriz.
        // a) Browser
        capabilities.setBrowserName("chrome");


        // b) Isletim Sistemi
        capabilities.setPlatform(Platform.WINDOWS);


        // c) Browser Version (Istege bagli)
        capabilities.setVersion("96.0.4664.45");


        ChromeOptions options = new ChromeOptions();

        String hubURL = "http://192.168.1.148:4444/wd/hub";

        WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);

        driver.get("https://www.google.com.tr/");
        System.out.println(driver.getTitle());
    }
}
