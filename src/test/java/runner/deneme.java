package runner;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.BeforeLogin.RegisterPage;
import utilities.Base;
import utilities.ChromeBase;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.android.nativekey.AndroidKey.*;

public class deneme {

    AndroidDriver<AndroidElement> driverChrome =ChromeBase.cap();


    public deneme() throws IOException {
    }

    @Test
    public void test() throws IOException, InterruptedException {

        driverChrome.get("https://www.google.com");
        JavascriptExecutor executor = (JavascriptExecutor)driverChrome;
        executor.executeScript("arguments[0].click();", driverChrome.findElement(By.xpath("//*[@text='Allow']")));

        driverChrome.findElement(By.id("input")).sendKeys("geçici email");
        Thread.sleep(2000);
        AndroidDriver<AndroidElement> driver=Base.capabilities(ConfigurationReader.get("device"),ConfigurationReader.get("app"));
        RegisterPage rp = new RegisterPage(driver);

        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(rp.TurkeyButton));
        rp.TurkeyButton.click();
        rp.SkipButton.click();
        rp.loginButton.click();
        rp.RegisterButton.click();
        rp.EmailBox.click();
       // rp.EmailBox.sendKeys(email);
        rp.SendEmailButton.click();
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        Thread.sleep(2000);






    }
}
