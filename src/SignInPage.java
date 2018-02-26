import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;


public class SignInPage {


    public SignInPage clickSignInBtn(WebDriver webDriver) {
        By signInButton = By.linkText("Sign Up");
        WebElement SignInButton = webDriver.findElement(signInButton);
        if (SignInButton.isDisplayed() || SignInButton.isEnabled())
            SignInButton.click();
        return new SignInPage();
    }


    private By Username = By.name("uname");
    private By Password = By.name("pass");
    private By RepeatPassword = By.name("rpass");
    private By Email = By.name("email");
    private By Name = By.name("name");





    public void enterUserName(WebDriver webDriver)
    {

        WebElement SignInUserText = webDriver.findElement(Username);
        SignInUserText.sendKeys("Ram");


        WebElement SignInPasswordText = webDriver.findElement(Password);
        SignInPasswordText.sendKeys("abc");

        Actions actions = new Actions(webDriver);
        actions.moveToElement(SignInPasswordText).perform();
        webDriver.findElement(Password).click();


        WebElement SignInRPasswordText = webDriver.findElement(RepeatPassword);
        SignInRPasswordText.sendKeys("abc");

        WebElement SignInEmail = webDriver.findElement(Email);
        SignInEmail.sendKeys("abc@gmail.com");

        WebElement SignInName = webDriver.findElement(Name);
        SignInName.sendKeys("ram");

        //WebElement SignInSex = webDriver.findElement(By.id("m"));
        //SignInSex.click();

        List<WebElement> rad_sex= webDriver.findElements(By.name("gender"));
        Boolean sex;
        sex = rad_sex.get(0).isSelected();
         if(sex==true){
          rad_sex.get(0).click();
         }
         else {
             rad_sex.get(1).click();
         }
         WebElement Checkbox = webDriver.findElement(By.xpath("//input[@id='tac']"));
         Checkbox.click();

    }




    public void ErrorforUsername(WebDriver webDriver)
     {
         WebElement Errormgsusename= webDriver.findElement(By.xpath("//div[@class='box error radius_3x']"));
         String Errormg=Errormgsusename.getText();
         
         if( Errormgsusename.isEnabled()&& Errormg.contains("Username already taken, please be more creative!"))
         {
             System.out.println(Errormg);
         }
         else

         {
           System.out.println("Print the message");

     }
     }



}










