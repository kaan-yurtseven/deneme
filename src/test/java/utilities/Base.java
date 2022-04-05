package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities(String device, String App) throws IOException {


        File appDir = new File("src");

        File app = new File(appDir, App);

        DesiredCapabilities dcp = new DesiredCapabilities();

        if(device.equalsIgnoreCase("emulator")) {
            dcp.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("EmulatorDeviceName"));
        }else if(device.equalsIgnoreCase("real")){

            dcp.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("RealDeviceName"));

        }else  if (device.equalsIgnoreCase("simulator")){
            dcp.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("SimulatorDeviceName"));
        }


        dcp.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

        //UI Automator ->Android apps
        dcp.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        dcp.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);



        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dcp);

        return driver;


    }
}
