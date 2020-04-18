package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver ;

    @FindBy(xpath ="//input[@aria-label='Username']")
    WebElement txtUserName;

   @FindBy(xpath = "//input[@aria-label='Password']")
    WebElement txtPassword;

   @FindBy(xpath = "//button[text()='Sign In']")
   WebElement btnSignIn;
   public LoginPage(WebDriver driver){
       this.driver = driver ;
       PageFactory.initElements(driver,this);
   }

   public void setUserName(String value){
       txtUserName.sendKeys(value);
   }
   public void setPassword(String value){
       txtPassword.sendKeys(value);
   }
   public void clickSignIn(){
       btnSignIn.click();
   }

   public void login(String value, String value1){
       this.setUserName(value);
       this.setPassword(value1);
       this.clickSignIn();
   }

}
