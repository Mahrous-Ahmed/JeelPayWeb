package Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExplicitWait {
    private WebDriverWait wait;

    public ExplicitWait(WebDriver driver){
        wait = new WebDriverWait(driver , Duration.ofSeconds(40));
    }

    public void waitElementToDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementToClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementsToVisible(List<WebElement> elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitElementURLToBe(String url){
        wait.until(ExpectedConditions.urlToBe(url));
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
