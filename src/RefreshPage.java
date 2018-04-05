import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class RefreshPage {


    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.gecko.driver",

                "C:\\Users\\Admin\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://dzone.com/articles/7-easy-steps-to-make-facebook-messenger-bots");

        for (int i = 0; i < 1000; i++) {
            driver.navigate().refresh();
            Thread.sleep(7000);
        }
    }
}