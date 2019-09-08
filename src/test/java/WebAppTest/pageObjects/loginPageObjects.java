package WebAppTest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class loginPageObjects {

    public loginPageObjects(WebDriver driver) {
                PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using = "input#account_email")
    public WebElement txt_username;

    @FindBy(how = How.CSS, using = "input#account_password")
    private WebElement txt_password;

    @FindBy(how = How.CSS, using = "input[name=\"commit\"]")
    private WebElement btn_loggin;

    @FindBy(how = How.CSS, using = "form#new_account div.control-group.boolean.optional.account_remember_me > div > label")
    private WebElement chk_remember;

    @FindBy(how = How.CSS, using = "div#wrap div.alert.fade.in.alert-alert")
    private WebElement alert_message;

    public void verify_loginPage(){

        assertTrue( "Username textbox is not found",txt_username.isDisplayed());
        assertTrue( "Password textbox is not found",txt_password.isDisplayed());
        assertTrue( "Remember checkbox is not found",chk_remember.isDisplayed());
        assertTrue( "Login button is not found",btn_loggin.isDisplayed());

    }
    public void enter_username(){
        txt_username.sendKeys( "vino" );

    }
    public void enter_password(){

        txt_password.sendKeys( "vino" );
    }
    public void login_click(){

        btn_loggin.click();
    }
    public void remember_check(){

        chk_remember.click();
    }
    public void verify_loginFailed(){
        String s=alert_message.getText();
        System.out.println(s);
        assertTrue( "Invalid email address or password message is not displayed correctly",!(s.equals( "Invalid email address or password" )));



    }
}
