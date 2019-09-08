package WebAppTest.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertTrue;
import WebAppTest.pageObjects.homePageObjects;


public class homePageSteps {
    WebDriver driver;
    @Given("^I launch the website$")
    public void homePage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","src/test/resources/WebAppTest/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        String launchURL = "http://www.babbel.com";
        driver.get(launchURL);
        driver.manage().window().maximize();
        Thread.sleep( 3000 );


    }

    @Then("^I can see the option for login and register$")
    public void homePageVerification() throws Throwable {
        homePageObjects home=new homePageObjects( driver );
        home.verify_login();
        home.verify_register();

    }
    @Then("^I verify the logo Babbel$")
    public void homeLogoVerification() throws Throwable {
        homePageObjects home=new homePageObjects( driver );
        home.verify_logo();
        driver.quit();
    }
    @When( "^I click on login$")
    public void loginClick() throws Throwable {
        homePageObjects home=new homePageObjects( driver );
        home.login_click();
    }
}
