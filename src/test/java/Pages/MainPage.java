package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//*[@name=\"signin\"]")
    public WebElement loginInput;

    @FindBy(xpath = "//*[@name=\"profile\"]")
    public WebElement profileName;

    @FindBy(className = "profile-m-edit-signout")
    public WebElement linkExit;
}

