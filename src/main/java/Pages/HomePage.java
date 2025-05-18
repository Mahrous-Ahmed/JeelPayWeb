package Pages;

import Waits.ExplicitWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    @FindBy(xpath = "//button[text() = 'Sign Up']")
    private WebElement signUpBTN;

    @FindBy(tagName = "input")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement SignInButton;

    @FindBy(xpath = "//input[@type='tel']")
    private List<WebElement> OTPInputs;

    @FindBy(xpath = "//input[@type= 'password']")
    private List<WebElement> passwordInputs;

    private WebDriver driver;
    private ExplicitWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
        wait = new ExplicitWait(driver);
    }


    public HomePage clickOnSignUp(){
        wait.waitElementToClickable(signUpBTN);
        signUpBTN.click();
        driver.switchTo().window(driver.getWindowHandle());
        return this;
    }

    public HomePage enterPhoneNumber(String phoneNum){
        wait.waitElementToClickable(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(phoneNum);
        return this;
    }

    public HomePage clickOnSignINButton(){
        wait.waitElementToClickable(SignInButton);
        SignInButton.click();
        return this;
    }

    public HomePage enterPassword(String password){
        int idx = 0;
        wait.waitElementsToVisible(passwordInputs);
        for (WebElement element :passwordInputs ){
            element.click();
            element.sendKeys(""+password.charAt(idx));
            idx++;
        }
        return this;
    }

    public HomePage enterOTP(String OTP){
        int idx = 0;
        wait.waitElementsToVisible(OTPInputs);
        for (WebElement element :OTPInputs ){
            element.click();
            element.sendKeys(""+OTP.charAt(idx));
            idx++;
        }
        return this;
    }

}
