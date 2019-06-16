

package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class playVideo {


    public static void py(WebDriver driver) {


        driver.manage().timeouts().implicitlyWait(30, SECONDS);


        driver.findElement(By.xpath("//div[@class=\"OIL2le\"]")).click();


    }
}