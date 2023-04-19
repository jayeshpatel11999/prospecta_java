package Tests;

import Utils.Config;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class Login_Test extends Config {
    @Test(priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    public void staging_initiator_login() throws InterruptedException {
    loginPage.enter_username_and_password_of_staging_initiator();
    loginPage.click_on_login_button_and_redirect_on_dashboard();
    }
    @Test(priority = 2)
    @Severity(SeverityLevel.BLOCKER)
    public void staging_reviewer_login () throws InterruptedException {
        loginPage.enter_username_and_password_of_staging_reviewer();
        loginPage.click_on_login_button_and_redirect_on_dashboard();
    }
    @Test(priority = 3)
    @Severity(SeverityLevel.BLOCKER)
    public void int_initiator_login() throws InterruptedException {
        loginPage.enter_username_and_password_of_int_initiator();
        loginPage.click_on_login_button_and_redirect_on_dashboard();
    }
    @Test(priority = 4)
    @Severity(SeverityLevel.BLOCKER)
    public void int_reviewer_login() throws InterruptedException {
        loginPage.enter_username_and_password_of_int_reviewer();
        loginPage.click_on_login_button_and_redirect_on_dashboard();
    }
}