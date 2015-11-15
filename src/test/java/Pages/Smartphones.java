package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Smartphones {
    //*[@id="m-main"]/li[2]/a

    @FindBy(xpath = "//ul[@menu_name ='main_menu']/li[position()=2]/a")
    public WebElement phonesMP3Menu;

    //*[@id="head_banner_container"]/div/div[2]/div/div/div[1]/div/ul[2]/li[1]/ul/li[1]/a
    @FindBy(xpath = "//ul[@class ='m-cat-subl']/li[position()=1]/a")
    public WebElement smartphonesMenu;

    //*[@id="head_banner_container"]/div/div[2]/div[2]/div/div[1]/div/ul[2]/li[1]/ul/li[1]/a
    @FindBy(linkText = "Все смартфоны")
    public WebElement allSmartphonesMenu;


    @FindBy(id = "page2")
    public WebElement buttonPage2;

}
