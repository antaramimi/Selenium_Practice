import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {


    private By Login= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/a[1]");

    public void LogInPages(WebDriver WebDriver){

        WebElement Loginpage =WebDriver.findElement(Login);
        Loginpage.click();



        WebElement popup = WebDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]']"));
        popup.sendKeys("antaramimi@gmail.com");



    }
}
