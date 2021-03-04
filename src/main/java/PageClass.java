import org.openqa.selenium.WebElement;

public class PageClass extends ConnectionString {

    WebElement homeBtn;
    WebElement chatBtn;
    WebElement meetingsBtn;
    WebElement editMeeting;
    WebElement advancedDropdown;
    WebElement radioBtn1;
    WebElement radioBtn2;
    WebElement saveBtn;

    String homeButton = "Home";
    String chatButton = "Chat";
    String meetingsButton = "Meetings";
    String editMeetingBtn = "edit meeting";
    String advancedDropdownButton = "Advanced meeting options, Collapsed";
    String saveButton = "Save";
    String radio1 = "Allow participants to join anytime";
    String radio2 = "Mute participants upon entry";


    String sampleText = "Hello, My name is Siraj and I am Test Engineer at 10Pearls!";
    String message = "Clicking ";

    public void driverWait() throws InterruptedException {
        Thread.sleep(5);
    }
}
