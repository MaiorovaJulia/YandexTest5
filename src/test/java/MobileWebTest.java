import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
///////import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;


    /**
     *
     */
    public class MobileWebTest {

        @Test
        public void testIncorrectFBLogin() throws Exception{
            URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "claguruemulatornexus5");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");


            System.out.println("Step 1. Create new driver");
            AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //WebDriverWait wait = new WebDriverWait(driver, 30);


            System.out.println("Step 6. Close driver");
            driver.quit();
        }
    }
