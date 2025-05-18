import DataReader.JsonReader;
import DataReader.PropertyReader;
import Drivers.DriverFactory;
import Drivers.DriverHolder;
import Pages.HomePage;
import Utils.LoggedInUserInfo;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {


    @Parameters({"platformName","URL"})
    @BeforeSuite
    public void setUp(String platformName , String URL)  {
        DriverHolder.setDriver(new DriverFactory().initDriver(platformName, URL ));
    }


    @Parameters("User")
    @BeforeTest
    public void beforeTest(String User) throws IOException, InterruptedException {
        String JsonPath = System.getProperty("user.dir")+"/src/test/resources/Users.json";
        LoggedInUserInfo.setUserData(new JsonReader(JsonPath).getUserDataFromJson(User));

         new HomePage(DriverHolder.getDriver())
                 .enterPhoneNumber(LoggedInUserInfo.userData.phoneNumber)
                 .clickOnSignINButton()
                 .enterOTP(LoggedInUserInfo.userData.OTP)
                 .enterPassword(LoggedInUserInfo.userData.password);

         Thread.sleep(20000);



    }




    @AfterSuite
    public void tearDown(){
        DriverHolder.getDriver().quit();
    }
}
