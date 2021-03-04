import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class NotepadTest extends PageClass{
/*
    Test Case #1:
            1. Open “Notepad”
            2. Open “Help” menu item
            3. Press “About Notepad”
            4. Press “OK” button
*/
    @Test(priority = 1)
    public void checkAboutWindow() {
        winDriver.findElementByName("Help").click();
        winDriver.findElementByName("About Notepad").click();
        winDriver.findElementByName("OK").click();
    }

    /*Test Case #2:
        1. Open “Notepad”
        2. Type text and current date
        3. Clear the results
    */

    @Test(priority = 2)
    public void sendTestText() throws InterruptedException {
        winDriver.findElementByClassName("Edit").sendKeys(sampleText + "\n and Today's date is: " + getDate());
        driverWait();
        winDriver.findElementByClassName("Edit").clear();
    }

    /*
     Test Case #3
        1. Open “Notepad”
        2. Open “Edit” menu item
        3. Press “Time/Date” in dropdown menu
        4. Confirm that the test is displayed in "Notepad"
        5. Clear the results
      */

    @Test(priority = 3)
    public void pressTimeAndDateButton() throws InterruptedException {
        winDriver.findElementByName("Edit").click();
        driverWait();

        winDriver.findElementByAccessibilityId("26").click();
        Assert.assertNotNull(winDriver.findElementByClassName("Edit"));
        driverWait();
        winDriver.findElementByClassName("Edit").clear();
    }

    private static String getDate(){
        LocalDate date = LocalDate.now();
        return date.toString();
    }

}
