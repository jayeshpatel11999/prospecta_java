package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.WebDriver;

public class Verfiy_Approve_Status_of_Request_Page extends Locators {
    Common common =new Common(driver);

    public Verfiy_Approve_Status_of_Request_Page(WebDriver driver) {
        super(driver);
    }
    public void Verify_Approve_Status_Of_Request(){
        common.click(Continue_Button , "continue button");
        common.isElementDisplayed(Record_Request_Created_Successfully , "Record request created successfully msg ");
    }
}
