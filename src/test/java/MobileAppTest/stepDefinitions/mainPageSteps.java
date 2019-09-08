package MobileAppTest.stepDefinitions;
import cucumber.api.java.en.Then;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import cucumber.api.java.en.Given;
import MobileAppTest.pageObjects.mainPageObjects;


public class mainPageSteps {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();

    @Given("^I launch the app$")
    public void launchPage() throws MalformedURLException {
        System.out.println("Inside method");
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "041604dbf02a0402");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Calculator");
        driver = new AndroidDriver<>(new URL("http://localhost:4733/wd/hub"), dc);


    }
    @Then("^I verify the presence of input text$")
    public void verifyText() throws Throwable  {
        mainPageObjects m=new mainPageObjects(driver);
        m.verify_numberText();


    }
    @Then("^I add values in calc$")
    public void addText() throws Throwable  {
        mainPageObjects m=new mainPageObjects(driver);
        m.enter_number01();
        m.click_add();
        m.enter_number07();
        m.click_equal();



    }
}
