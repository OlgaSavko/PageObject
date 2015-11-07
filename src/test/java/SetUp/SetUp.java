package SetUp;


import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;



public class SetUp {
    static WebDriver driver;

    public static WebDriver getDriver() {
        //Change system property of webdriver manager to download latest 2.9 version of chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        System.out.println("Getting the driver instance");
        if (driver == null) {
            System.out.println("Starting a service...");
            ChromeDriverService service = new ChromeDriverService.Builder()
                    .withEnvironment(ImmutableMap.of("DISPLAY", ":20"))
                    .usingAnyFreePort()
                    .build();
            try {
                service.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver = new RemoteWebDriver(service.getUrl(),
                    DesiredCapabilities.chrome());
        }
        return driver;
    }
}

