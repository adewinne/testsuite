import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class contact_form {
    public static void main(String[] args) throws Exception {
        RemoteWebDriver wd;
        DesiredCapabilities caps = DesiredCapabilities.firefox();
            caps.setCapability("name", "contact_form");
        wd = new RemoteWebDriver(
            new URL("http://thereforeca:14485e0f-4ed8-40c2-899e-f853c1e3a9e5@ondemand.saucelabs.com:80/wd/hub"),
            caps);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://therefore.ca/contact");
        wd.findElement(By.cssSelector("div.col-sm-6")).click();
        wd.findElement(By.id("name")).click();
        wd.findElement(By.id("name")).clear();
        wd.findElement(By.id("name")).sendKeys("test");
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys("adewinne@gmail.com");
        wd.findElement(By.id("comment")).click();
        wd.findElement(By.id("comment")).clear();
        wd.findElement(By.id("comment")).sendKeys("test message");
        wd.findElement(By.xpath("//form[@id='contact-form']//button[.='Email us  ']")).click();
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
