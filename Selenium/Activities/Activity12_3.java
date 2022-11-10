import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions actions=new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println(driver.getTitle());
		
		//Find Sign in button
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
		
		//Hover over button
		actions.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
		String tooltipText=button.getAttribute("data-tooltip");
		System.out.println(tooltipText);
        
		//Click on the button
        button.click();
        
        //Wait for modal to be appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        
        //Find username and pasword and fill in the details
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        //Read the login message
        String LoginMsg=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(LoginMsg);
		
        driver.quit();

	}

}
