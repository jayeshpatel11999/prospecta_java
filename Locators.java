package Utils;

import org.openqa.selenium.WebDriver;

public class Locators extends Config{
    public Locators(WebDriver driver){
        this.driver =driver;
    }

    public String Username_Input_Box = "//input[@id='mat-input-1']";
    public String Continue_Button = "//span[contains(text(),'Continue')]//parent::button";
    public String Password_Input_Box = "//input[@id='mat-input-3']";
    public String Login_Button = "//span[contains(text(),'Login')]//parent::button";
    public String Add_New_Button_On_Dashboard = "//lib-button[@libhtmltooltip='Add new...']//button";
    public String Data_Tab_On_Dashboard = "//div[contains(text(),' Data ')]//parent::mat-list-item";
    public String Material_Master_In_Data_Tab = "//p[text()='Material Master'] | //p[text()=' Material Master ']";
    public String New_Record_Button = "//span[contains(text(),'New record ')]//parent::button";
    public String Material_Master_Record_Button = "//button[contains(text(),' Material Master Record  ')] | //button[contains(text(),' MaterialCreationFlow ')]";
    public String Input_Of_Material_Type = "//p[text()='Material Type ']//parent::*//parent::div//input[@role='combobox']";
    public String ERSA_Spare_Part_Option = "//span[text()=' ERSA -- Spare Part ']";
    public String Input_Of_Industry_Sector = "//p[text()='Industry Sector ']//parent::*//parent::div//input[@role='combobox']";
    public String I_Mining_Industry_Option = "//span[text()=' I -- Mining Industry '] | //span[text()=' C -- Chemical Industry ']";
    public String Input_Of_Material_Group = "//p[text()='Material Group ']//parent::*//parent::div//input[@role='combobox']";
    public String Input_Of_Base_Unit_Of_Measure = "//p[text()='Base Unit of Measure ']//parent::*//parent::div//input[@role='combobox']";
    public String EA_Each_Option = "//span[text()=' % -- Percentage ']";
    public String Input_Of_External_Material_Group_H = "//p[text()='External Material Group (H) ']//parent::*//parent::div//input[@role='combobox']";
    public String Option_Of_Material_H = "//span[text()=' 00101 -- Finished Products ']";
    public String Input_Of_Product_Allocation = "//p[text()='Product Allocation ']//parent::*//parent::div//input[@role='combobox']";
    public String General_Item_Option = "//span[text()=' 001 -- General Item ']";
    public String Liter_Volume_Option = "//span[text()=' L -- Liter ']";
    public String Input_Of_volume_Unit = "//p[text()='Volume unit ']//parent::*//parent::div//input[@role='combobox']";
    public String Input_Of_Unit_Of_Weight = "//p[text()='Unit of Weight ']//parent::*//parent::div//input[@role='combobox']";
    public String KG_Kilo_Gram_Weight_Option = "//span[text()=' KG -- Kilo-Gram '] | //span[text()=' KG -- Kilogram ']";
    public String Mechanics_Option_Of_Material_Group = "//span[text()=' 00104 -- Mechanics ']";
    public String Plus_Button_Of_Plant_Data =  "//p[text()='Plant Data ']//parent::*//parent::div//button";
    public String Checkbox_Of_Plant_0001 = "(//div[@class='dropdown-option text-overflow'])[1]";
    public String Checkbox_Of_Plant_0004 = "(//div[@class='dropdown-option text-overflow'])[4]";
    public String Apply_Button = "//span[text()=' Apply ']//parent::button";
    public String Input_Of_Valuation_Data = "//p[text()='Valuation Cat. ']//parent::*//parent::div//input[@role='combobox']";
    public String A_New_Purchase_Option = "//span[text()=' A -- New Purchase ']";
    public String Input_Of_MRP_Type = "//p[text()='MRP Type ']//parent::*//parent::div//input[@role='combobox']";
    public String M0_MPS_Fixing_type_Option = "//span[text()=' M0 -- MPS, fixing type -0- ']";
    public String Input_Of_Loading_Group = "//p[text()='Loading Group ']//parent::*//parent::div//input[@role='combobox']";
    public String Crane_0001_Option = "//span[text()=' 0001 -- Crane ']";
    public String Input_Box_Of_Manufacturer_Part_Number = "//p[text()='Manufacturer Part Number']//parent::*//parent::*//parent::div//input";


    public String Submit_Button = "//span[text()=' Submit ']//parent::button";
    public String Record_Request_Created_Successfully = "//div[@class='cdk-overlay-pane']";
    public String Three_Dot_Button = "//tbody[@role='rowgroup']//tr[1]//td[2]//button";
    public String Profile_Button = "//div[@class='mat-card-avatar ng-star-inserted mdo-small']";
    public String Signout_Button = "//span[text()='Sign out']//parent::button";
}
98778