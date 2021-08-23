package test.java.test.ui.page.base;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveInitializer {

    public DriveInitializer(WebDriver driver, String pageUrl){
        driver = WebDriverRunner.getWebDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(pageUrl);
    }

}
