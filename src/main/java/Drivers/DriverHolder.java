package Drivers;

import org.openqa.selenium.WebDriver;

public class DriverHolder {
    private static WebDriver _driver;

    public static void setDriver(WebDriver driver){
        _driver = driver;
    }

    public static WebDriver getDriver(){
        return _driver;
    }
}
