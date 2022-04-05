package pages.BeforeLogin;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage  {
    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @FindBy(xpath = "//*[@content-desc='Turkey']")
    public WebElement TurkeyButton;

    @FindBy(xpath = "//*[@content-desc='Skip']")
    public WebElement SkipButton;

    @FindBy(xpath = "//*[@content-desc='Login']")
    public WebElement loginButton;
}
