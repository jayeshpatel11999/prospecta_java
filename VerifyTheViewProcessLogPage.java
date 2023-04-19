package Pages;

import Utils.Common;
import Utils.Config;
import Utils.Locators;
import org.openqa.selenium.WebDriver;

import java.util.spi.LocaleNameProvider;

public class VerifyTheViewProcessLogPage extends Locators {
    Common common =new Common(driver);
    public VerifyTheViewProcessLogPage(WebDriver driver) {
        super(driver);
    }
    public void Verify_The_View_Process_Log_Page(){
        common.click(Continue_Button , "continue button");
        common.isElementDisplayed(Record_Request_Created_Successfully , "Record request created successfully msg ");
    }

}
