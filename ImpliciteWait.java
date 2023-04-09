package MainPackage.SeleniumChromeDriver.locators.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImpliciteWait { //IMPLICITE WAIT IN DURATION OF SECONDS
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.amazon.com/");
        //IMPLICITLY APPLY WAIT IN DURATION OF SECONDS
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement we = wd.findElement(By.id("twotabsearchtextbox"));
        we.sendKeys("Mens Cloth");
        we.click();
        wd.close();
    }
}