package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.WebDriver;

public class AddNewMaterialMasterWorkflowRolePage extends Locators {
    Common common =new Common(driver);
    public AddNewMaterialMasterWorkflowRolePage(WebDriver driver) {
        super(driver);
    }

    public void click_on_data_tab(){
        common.click(Data_Tab_On_Dashboard, "Add new button on dashboard");
        common.click(Material_Master_In_Data_Tab, "material master in Data tab");
        common.click(New_Record_Button , "new Record button");
        common.scroll_To_Element(Material_Master_Record_Button);
        common.click(Material_Master_Record_Button , "material master record button");
        common.click(Input_Of_Material_Type , "input of material type");
        common.click(ERSA_Spare_Part_Option , "ERSA Spare Part Option");
       // common.click(Input_Of_Material_Group , "input of material group");
      //  common.click(Mechanics_Option_Of_Material_Group , "mechanics option");
        common.click(Input_Of_Industry_Sector , "input of industry sector");
        common.click(I_Mining_Industry_Option , "i mining");
        common.scroll_To_Element(Input_Of_Base_Unit_Of_Measure);
        common.click(Input_Of_Base_Unit_Of_Measure , "input of base unit of measure");
        common.click(EA_Each_Option , "ea_each");
        common.scroll_To_Element(Input_Of_External_Material_Group_H);
        common.click(Input_Of_External_Material_Group_H , "input of external material group H");
        common.scroll_To_Element(Option_Of_Material_H);
        common.click(Option_Of_Material_H , "material h");
        common.scroll_To_Element(Input_Of_Product_Allocation);
        common.click(Input_Of_Product_Allocation , "product allocation");
        common.scroll_To_Element(General_Item_Option);
        common.click(General_Item_Option , "general item");
        common.scroll_To_Element(Input_Of_Unit_Of_Weight);
        common.click(Input_Of_Unit_Of_Weight , "general item");
        common.scroll_To_Element(KG_Kilo_Gram_Weight_Option);
        common.click(KG_Kilo_Gram_Weight_Option , "general item");
        common.scroll_To_Element(Input_Of_volume_Unit);
        common.click(Input_Of_volume_Unit , "input of volume");
        common.scroll_To_Element(Liter_Volume_Option);
        common.click(Liter_Volume_Option, "bag volume optio");
        common.click(Plus_Button_Of_Plant_Data , "plus button of plant data");
        common.click(Checkbox_Of_Plant_0004 , "checkbox of plant 0004");
        common.click(Apply_Button , "apply button");
        // scroll_To_Element(Input_Of_Valuation_Data);
        //  click(Input_Of_Valuation_Data , "input of volume");
        //  scroll_To_Element(A_New_Purchase_Option);
        //  click(A_New_Purchase_Option , "bag volume optio");
        common.scroll_To_Element(Input_Of_MRP_Type);
        common.click(Input_Of_MRP_Type , "input of volume");
        common.scroll_To_Element(M0_MPS_Fixing_type_Option);
        common.click(M0_MPS_Fixing_type_Option , "bag volume option");
        common.scroll_To_Element(Input_Of_Loading_Group);
        common.click(Input_Of_Loading_Group , "input of volume");
        common.scroll_To_Element(Crane_0001_Option);
        common.click(Crane_0001_Option , "bag volume option");
        common.sendKeys(Input_Box_Of_Manufacturer_Part_Number , "6767" , "enter number");
        common.click(Submit_Button , "submit button");
        common.isElementDisplayed(Record_Request_Created_Successfully , "Record request created successfully msg ");
        common.refresh();
        common.click(Three_Dot_Button , "thre dot button");
        common.click(Profile_Button , "Profile button");
        common.click(Signout_Button , "Signout button");

    }
}
