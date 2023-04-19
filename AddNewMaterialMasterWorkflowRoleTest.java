package Tests;

import Utils.Config;
import org.testng.annotations.Test;

public class AddNewMaterialMasterWorkflowRoleTest extends Config {
    @Test
    public void material_master_workflow() throws InterruptedException {
        loginPage.enter_username_and_password_of_int_initiator();
        loginPage.click_on_login_button_and_redirect_on_dashboard();
        addNewMaterialMasterWorkflowRole.click_on_data_tab();

    }
}