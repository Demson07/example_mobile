import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class test {
    AndroidDriver driver;

    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.materialstudies.reply");
        capabilities.setCapability("appActivity", "com.materialstudies.reply.ui.MainActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test
    public void testTest() {

    }
}
