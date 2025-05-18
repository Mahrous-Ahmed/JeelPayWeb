package Drivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DriverFactory {

    public WebDriver initDriver(String browserName , String URL)  {
        WebDriver driver;

        switch (browserName.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(URL);
                break;

            default:
                throw new RuntimeException();
        }

        return driver;
    }
}
