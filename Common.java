package Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class Common extends Config{
    public Common(WebDriver driver) {
        this.driver = driver;
    }

    public void click(String locator , String msg){
        pause(locator);
        driver.findElement(By.xpath(locator)).click();
        System.out.println("Clicked on " + msg +".");
    }
    public void refresh(){

        driver.navigate().refresh();
        System.out.println("Page Refreshed.");
    }

    public void sendKeys(String locator, String data , String msg){
        pause(locator);
        driver.findElement(By.xpath(locator)).sendKeys(data);
        System.out.println("Entered " + msg + " "  + data + ".");
    }
    public void isElementDisplayed(String locator , String msg){
        pause(locator);
        driver.findElement(By.xpath(locator)).isDisplayed();
        System.out.println(msg +" is Displayed.");
    }
    public void pause(String locator){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        highLighterMethod(locator);
    }
    public void scroll_To_Element(String locator) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement e = driver.findElement(By.xpath(locator));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", e);
    }
    public void getText(String locator){
        pause(locator);
        driver.findElement(By.xpath(locator)).getText();
    }
    public void highLighterMethod(String locator){
        WebElement ele = driver.findElement(By.xpath(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", ele);
    }
    public void doubleClick(String locator , String msg){
        pause(locator);
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath(locator));
        act.doubleClick(ele).perform();
        System.out.println("Double Clicked on " + msg +".");
    }
}