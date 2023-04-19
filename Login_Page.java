package Pages;

import Utils.Common;
import Utils.Locators;
import Utils.ReadDataFromJson;
import org.openqa.selenium.WebDriver;

public class Login_Page extends Locators {
    Common common =new Common(driver);
    ReadDataFromJson read = new ReadDataFromJson();
    public Login_Page(WebDriver driver) {
        super(driver);
    }
    public void enter_username_and_password_of_staging_initiator() {
        read.json_reader();
        common.isElementDisplayed(Username_Input_Box , "UserName input box");
        String user_name = read.staging_initiator.get("UserName").toString();
        common.sendKeys(Username_Input_Box , user_name , "username");
        common.click(Continue_Button , "continue button");
        String Password = read.staging_initiator.get("Password").toString();
        common.sendKeys(Password_Input_Box, Password , "password");
    }
    public void enter_username_and_password_of_staging_reviewer() {
        read.json_reader();
        common.isElementDisplayed(Username_Input_Box , "UserName input box");
        String user_name = read.staging_reviewer.get("UserName").toString();
        common.sendKeys(Username_Input_Box , user_name , "username");
        common.click(Continue_Button , "continue button");
        String Password = read.staging_reviewer.get("Password").toString();
        common.sendKeys(Password_Input_Box, Password , "password");
    }
    public void enter_username_and_password_of_int_initiator() {
        read.json_reader();
        common.isElementDisplayed(Username_Input_Box , "UserName input box");
        String user_name = read.int_initiator.get("UserName").toString();
        common.sendKeys(Username_Input_Box , user_name , "username");
        common.click(Continue_Button , "continue button");
        String Password = read.int_initiator.get("Password").toString();
        common.sendKeys(Password_Input_Box, Password , "password");
    }
    public void enter_username_and_password_of_int_reviewer() {
        read.json_reader();
        common.isElementDisplayed(Username_Input_Box , "UserName input box");
        String user_name = read.int_reviewer.get("UserName").toString();
        common.sendKeys(Username_Input_Box , user_name , "username");
        common.click(Continue_Button , "continue button");
        String Password = read.int_reviewer.get("Password").toString();
        common.sendKeys(Password_Input_Box, Password , "password");
    }
    public void click_on_login_button_and_redirect_on_dashboard() throws InterruptedException {
        common.click(Login_Button , "login button");
        common.isElementDisplayed(Add_New_Button_On_Dashboard , "Add new button on dashboard ");
        Thread.sleep(5000);
    }
}
