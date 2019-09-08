package MobileAppTest.pageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;


public class mainPageObjects {
    private AndroidDriver<AndroidElement> appiumDriver;
    public mainPageObjects(AndroidDriver<AndroidElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
    @AndroidFindBy(id = "txtCalc")
    @iOSFindBy(id = "txtCalc")
    public MobileElement numbertext;

    @AndroidFindBy(id = "bt_01")
    @iOSFindBy(id = "bt_01")
    public MobileElement button01;

    @AndroidFindBy(id = "bt_07")
    @iOSFindBy(id = "bt_07")
    public MobileElement button07;

    @AndroidFindBy(id = "bt_add")
    @iOSFindBy(id = "bt_add")
    public MobileElement buttonadd;

    @AndroidFindBy(id = "bt_equal")
    @iOSFindBy(id = "bt_equal")
    public MobileElement buttonequal;

    public void verify_numberText(){

        assertTrue( "Login button is not found",numbertext.isDisplayed());
    }
    public void enter_number01(){

        button01.click();
    }
    public void enter_number07(){

        button07.click();
    }

    public void click_add(){

        buttonadd.click();
    }
    public void click_equal(){

        buttonequal.click();
    }

}


