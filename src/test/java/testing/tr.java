package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class tr{




    public static void  yy(WebDriver driver){



        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30,SECONDS);

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("hello");



    }

public static void gg(WebDriver driver) throws InterruptedException {



  Thread.sleep(100);


    driver.findElement(By.xpath("//b[contains(text(),'kitty')]")).click();

}




}