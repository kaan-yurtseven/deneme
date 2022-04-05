package pages.BeforeLogin;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends HomePage {

    public RegisterPage(AppiumDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@content-desc='Register']")
    public WebElement RegisterButton;

    @FindBy(className = "android.widget.EditText")
    public WebElement EmailBox;

    @FindBy(xpath = "//*[@content-desc='Send Verify Code']" )
    public WebElement SendEmailButton;

}
