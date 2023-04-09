package MainPackage.SeleniumChromeDriver.locators.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExpliciteWait {//EXPLICITLY WAIT BY "WebDriverWait" CLASS
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.amazon.com/");
        WebElement we = wd.findElement(By.id("twotabsearchtextbox"));
        we.sendKeys("Mens cloth");
        we.click();
        WebDriverWait wdw = new WebDriverWait(wd, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.elementToBeClickable(we));
        /**WebDriverWait is class having method Until()
         * WebDriverWait extends fluent wait
         * fluent wait implements wait*/
        we.click();

wd.close();
    }
}
