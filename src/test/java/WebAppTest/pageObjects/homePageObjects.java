package WebAppTest.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;
public class homePageObjects {
    public homePageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using = "div#wrap div > div:nth-child(4) > a")
    private WebElement btn_login;

    @FindBy(how = How.CSS, using = "div#wrap div.navbar.navbar-fixed-top > div > div > div:nth-child(3) > a")
    private WebElement btn_register;

    @FindBy(how = How.CSS, using = "div#wrap div.navbar.navbar-fixed-top > div > div > a > img")
    private WebElement img_logo;

    public void verify_login(){
        assertTrue( "Login button is not found",btn_login.isDisplayed());
    }
    public void verify_register(){
        assertTrue( "Register button is not found",btn_register.isDisplayed());
    }
    public void verify_logo(){
        assertTrue( "Babbel logo is not found",img_logo.isDisplayed());
    }
    public void login_click(){

        btn_login.click();
    }
}
