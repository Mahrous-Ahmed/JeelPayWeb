package Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    private WebDriverWait wait;

    public ExplicitWait(WebDriver driver){
        wait = new WebDriverWait(driver , Duration.ofSeconds(20));
    }

    public void waitElementToDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementToClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public Boolean checkElementIsDisplayed(WebElement element){
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
           return false;
        }

    }

}
