package WebAppTest.stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import WebAppTest.pageObjects.loginPageObjects;
public class loginPageSteps {
    WebDriver driver;
    @Given("^I launch the Babbel login page$")
    public void homePage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","src/test/resources/WebAppTest/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        String launchURL = "https://accounts.babbel.com/en/accounts/sign_in";
        driver.get(launchURL);
        driver.manage().window().maximize();
        Thread.sleep( 3000 );


    }
    @Then("^I verify the login screen$")
    public void loginScreenVerification() throws Throwable {
        loginPageObjects log=new loginPageObjects( driver );
        log.verify_loginPage();

    }
    @When("^I enter invalid credentials to login$")
    public void loginCheck() throws Throwable {
        loginPageObjects log=new loginPageObjects( driver );
        log.enter_username();
        log.enter_password();
        log.remember_check();
        log.login_click();

    }
    @Then("^I Verify the error message$")
    public void loginFailedVerification() throws Throwable {
        loginPageObjects log=new loginPageObjects( driver );
        log.verify_loginFailed();
        driver.quit();

    }
}
