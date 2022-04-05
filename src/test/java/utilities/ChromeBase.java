package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ChromeBase {
    public static AndroidDriver<AndroidElement> cap() throws IOException {

        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("EmulatorDeviceName"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        //capabilities.setCapability("chromedriverExecutable","C:\\Webdriver\\chromedriver.exe");



        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);



        return driver;
    }
}
