import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",

                "C:\\Users\\Admin\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.compzets.com/");

        SignInPage S1 = new SignInPage();
         S1.clickSignInBtn(driver);
         S1.enterUserName(driver);
         S1.ErrorforUsername(driver);

         LogInPage L1=new LogInPage();
         L1.LogInPages(driver);

    }


}

