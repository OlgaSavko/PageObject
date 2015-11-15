package Pages;

import SetUp.SetUp;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPopUp {

    @FindBy(xpath = "//*[@name=\"login\"]")
    public WebElement login;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@name=\"auth_submit\"]")
    public WebElement submit;

    /*public void loginAs(String mylogin, String myPassword){
        login.sendKeys(mylogin);
        password.sendKeys(myPassword);
        submit.click();*/
    }

}