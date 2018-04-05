import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {


    private By Login= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/a[1]");

    public void LogInPages(WebDriver WebDriver){

        WebElement Loginpage =WebDriver.findElement(Login);
        Loginpage.click();



        WebElement popup = WebDriver.findElement(By.xpath("//input[@id='uname']"));
        popup.sendKeys("antaramimi@gmail.com");

        //Login with Social network side.

        




    }
}
