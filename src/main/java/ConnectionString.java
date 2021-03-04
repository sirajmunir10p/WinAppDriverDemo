import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ConnectionString {
    public static WindowsDriver winDriver;

    @BeforeTest
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\siraj.munir\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Zoom\\Zoom");
        //capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        capabilities.setCapability("platformName", "Windows");
        capabilities.setCapability("device", "WindowPC");

        try {
            winDriver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        winDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown(){
        winDriver.quit();
    }
}
