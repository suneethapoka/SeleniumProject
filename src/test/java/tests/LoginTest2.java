package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 {
    WebDriver driver;
    String expectedWelcomeMessage = "Welcome, Suneetha Poka (510139)[C]";
    String actualWelcomeMessage;

    @Test
    public void login() throws Exception {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        // driver.manage().timeouts().implicitlyWait(10 ,  TimeUnit.SECONDS);
        driver = new ChromeDriver();
        //  driver.manage().window().maximize();
        driver.get("https://wd5-impl.workday.com/wday/authgwy/qualcomm3/login.htmld");

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        Thread.sleep(10000);
        login.login("510139", "Test@1234");
        Thread.sleep(25000);
        actualWelcomeMessage = home.verifyNRetrunWelcomeText();
        if (actualWelcomeMessage.equalsIgnoreCase(expectedWelcomeMessage)) {
            System.out.println("Expected Welcome message is displaying : " + actualWelcomeMessage);
        }

        // login.setUserName("510139");
        // login.setPassword("Test@1234");
        //  login.clickSignIn();
        driver.quit();

    }

}
