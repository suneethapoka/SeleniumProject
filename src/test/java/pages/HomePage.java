package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//h1[@data-automation-id='landingPageWelcomeCardHeading']")
    WebElement lblwelcomeMsg;

    public String verifyNRetrunWelcomeText() {
        String message = null ;
        if (lblwelcomeMsg.isDisplayed()) {
            message = lblwelcomeMsg.getText();
        }
        return  message ;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
