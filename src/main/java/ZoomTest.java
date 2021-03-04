import org.testng.annotations.Test;

public class ZoomTest extends PageClass{

    @Test(priority = 1)
    public void startZoom() throws InterruptedException {

        homeBtn = winDriver.findElementByName(homeButton);
        homeBtn.click();
        System.out.println(message + homeButton);
        driverWait();

        chatBtn = winDriver.findElementByName(chatButton);
        chatBtn.click();
        System.out.println(message + chatButton);
        driverWait();

        meetingsBtn = winDriver.findElementByName(meetingsButton);
        meetingsBtn.click();
        System.out.println(message + meetingsButton);
    }

    @Test (priority = 2)
    public void editZoomMeeting() throws InterruptedException {
        //Edit a new meeting
        editMeeting = winDriver.findElementByName(editMeetingBtn);
        editMeeting.click();
        System.out.println(message + editMeetingBtn);

        advancedDropdown = winDriver.findElementByName(advancedDropdownButton);
        advancedDropdown.click();
        System.out.println(message + advancedDropdownButton);

        radioBtn1 = winDriver.findElementByName(radio1);
        radioBtn1.click();
        System.out.println(message + radio1);

        radioBtn2 = winDriver.findElementByName(radio2);
        radioBtn2.click();
        System.out.println(message + radio2);
        driverWait();

        saveBtn = winDriver.findElementByName(saveButton);
        saveBtn.click();
        System.out.println(message + saveButton);

        homeBtn.click();
    }
}