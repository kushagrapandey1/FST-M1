import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page: "+driver.getTitle());
		
		WebElement checkbox=driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement checkboxButton= driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		 //Click toggle button 
		checkboxButton.click();
		
        //Wait for checkbox to disappear
		System.out.println(wait.until(ExpectedConditions.invisibilityOf(checkbox)));
        Thread.sleep(20);
        //Click toggle button again
        checkboxButton.click();
        
        //Wait for checkbox to appear
       System.out.println(wait.until(ExpectedConditions.visibilityOf(checkbox)));
        
        //check the checkbox.
        checkbox.click();
        
        driver.quit();
        
        }

}
