package Drivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DriverFactory {

    public WebDriver initDriver(String browserName) throws IOException {

        if(browserName.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }

        return null;
    }
}
