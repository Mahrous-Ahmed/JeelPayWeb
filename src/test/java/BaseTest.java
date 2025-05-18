import DataReader.JsonReader;
import DataReader.PropertyReader;
import Drivers.DriverFactory;
import Drivers.DriverHolder;
import Utils.LoggedInUserInfo;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {


    @Parameters({"platformName"})
    @BeforeSuite
    public void setUp(String platformName) throws IOException {
        DriverHolder.setDriver(new DriverFactory().initDriver(platformName ));
    }


    @Parameters("User")
    @BeforeTest
    public void test(String User) throws IOException {
        String JsonPath = System.getProperty("user.dir")+"/src/test/resources/Users.json";
        LoggedInUserInfo.setUserData(new JsonReader(JsonPath).getUserDataFromJson(User));
    }



    @Test
    public void t () throws InterruptedException {
        Thread.sleep(20000);
        System.out.println(LoggedInUserInfo.userData.OTP);
        System.out.println("Done");
    }



    @AfterSuite
    public void tearDown(){
        DriverHolder.getDriver().quit();
    }
}
