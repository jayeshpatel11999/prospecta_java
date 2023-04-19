package Tests;

import Utils.Config;
import org.testng.annotations.Test;

public class VerifyTheViewProcessLogTest extends Config {

    @Test
    public void login_test() throws InterruptedException {
        loginPage.enter_username_and_password_of_staging_initiator();
        loginPage.click_on_login_button_and_redirect_on_dashboard();
        addNewMaterialMasterWorkflowRole.click_on_data_tab();
        verifyTheViewProcessLog.Verify_The_View_Process_Log_Page();
    }
}
