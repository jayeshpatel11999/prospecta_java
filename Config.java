package Utils;

import Pages.AddNewMaterialMasterWorkflowRolePage;
import Pages.Login_Page;
import Pages.VerifyTheViewProcessLogPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config {
    public WebDriver driver;
    public Login_Page loginPage;
    public AddNewMaterialMasterWorkflowRolePage addNewMaterialMasterWorkflowRole;
    public VerifyTheViewProcessLogPage verifyTheViewProcessLog;

    @BeforeMethod
    public void setUp() {
        ReadDataFromJson read = new ReadDataFromJson();
        read.json_reader();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String base_url = read.staging_reviewer.get("Base_URL").toString();
        driver.get(base_url);
        loginPage = new Login_Page(driver);
        addNewMaterialMasterWorkflowRole = new AddNewMaterialMasterWorkflowRolePage(driver);
        verifyTheViewProcessLog = new VerifyTheViewProcessLogPage(driver);
        //driver.get("https://fuse-int.masterdataonline.com/ngx-auth/en/index.html#/auth/Marcusone/enter-username");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed");
    }
}
