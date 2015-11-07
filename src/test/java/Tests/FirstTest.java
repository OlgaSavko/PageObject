package Tests;

import Pages.LoginPopUp;
import Pages.MainPage;
import SetUp.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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
    public void test1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("http://rozetka.ua");
        Thread.sleep(2000);
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
        System.out.println("Test end");
    }


}

