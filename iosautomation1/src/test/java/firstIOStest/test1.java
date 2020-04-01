package firstIOStest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class test1 {

    public IOSDriver driver;

    @Test(priority = 0)
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("noReset", true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2.1");
        capabilities.setCapability("app", "Users/anummirza/Library/Developer/Xcode/DerivedData/UIKitCatalog-eokxlxutkwpcixhhtftvorkgdtfh/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    }

    @Test(priority = 1)
    public void firstTest(){
        driver.findElementByAccessibilityId("Activity Indicators").click();
    }

}
