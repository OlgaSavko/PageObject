package Tests;

import Pages.LoginPopUp;
import Pages.MainPage;
import Pages.Smartphones;
import SetUp.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class FirstTest {
    static WebDriver driver;
    String rozetkaLogin = "utest4all@gmail.com";
    String rozetkaPassword = "javaqa0101";


    @BeforeMethod
    public void setUp(){
        driver = SetUp.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 4);
        driver.get("http://rozetka.ua");
        /*
        MainPage page = PageFactory.initElements(driver, MainPage.class);
        page.loginInput.click();
        LoginPopUp popUp = PageFactory.initElements(driver, LoginPopUp.class);
        popUp.loginAs(rozetkaLogin, rozetkaPassword);
        wait.until(ExpectedConditions.visibilityOf(page.profileName));
        String currentUserName = page.profileName.getText();
        System.out.println("Current user: " + currentUserName);
        Assert.assertTrue(currentUserName.equalsIgnoreCase("javaqa01"));
        page.profileName.click();
        wait.until(ExpectedConditions.visibilityOf(page.linkExit));
        Thread.sleep(500);
        page.linkExit.click();
        System.out.println("Test end");*/


        Smartphones smartphones = PageFactory.initElements(driver, Smartphones.class);
        //driver.findElement(By.xpath("//ul[@menu_name ='main_menu']/li[position()=2]/a"));
        smartphones.phonesMP3Menu.click();

        Smartphones smartphoneMenu = PageFactory.initElements(driver, Smartphones.class);
        //driver.findElement(By.xpath("//ul[@class ='m-cat-subl']/li[position()=1]/a"));
        smartphoneMenu.smartphonesMenu.click();

        Smartphones allSmartphones = PageFactory.initElements(driver, Smartphones.class);
        //driver.findElement(By.linkText("Все смартфоны"));
        allSmartphones.allSmartphonesMenu.click();

        List<WebElement> topPnonesP1 = driver.findElements(By.className("over-wraper"));
        System.out.println(topPnonesP1.size());//кількість елементів на 1-й сторінці по класу over-wraper

        for (WebElement w : topPnonesP1) {
            List<WebElement> topHitsEl = w.findElements(By.className("g-tag-icon-middle-popularity"));
            if (topHitsEl.size() > 0) {
                WebElement element = w.findElement(By.className("g-i-tile-i-title"));
                String name = element.findElement(By.tagName("a")).getText();
                String price = w.findElement(By.className("g-price-uah")).getText();
                System.out.println(name + " : " + price);
            }

        }

        Smartphones button = PageFactory.initElements(driver, Smartphones.class);
        button.buttonPage2.click();

        List<WebElement> topPnonesP2 = driver.findElements(By.className("over-wraper"));
        System.out.println(topPnonesP2.size());//кількість елементів на 1-й сторінці по класу over-wraper

        for (WebElement w : topPnonesP2) {
            List<WebElement> topHitsEl = w.findElements(By.className("g-tag-icon-middle-popularity"));
            if (topHitsEl.size() > 0) {
                WebElement element = w.findElement(By.className("g-i-tile-i-title"));
                String name = element.findElement(By.tagName("a")).getText();
                String price = w.findElement(By.className("g-price-uah")).getText();
                System.out.println(name + " : " + price);
            }
        }

    }


}

