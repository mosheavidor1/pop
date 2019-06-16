package testing;

import net.bytebuddy.implementation.bind.annotation.DefaultCall;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.FixMethodOrder;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

@FixMethodOrder



public class Main {


    private static WebDriver driver;


    @Before

    public void main() {


        System.setProperty(UploadDriver.upload1, UploadDriver.upload2);


    }


    @Test

    public void Test01() {
        driver = new ChromeDriver();

        tr.yy(driver);


    }


    @Test

    public void Test02() throws InterruptedException {


        tr.gg(driver);

    }


    @Test

    public void Test03() throws InterruptedException {

        playVideo.py(driver);




    }
}
