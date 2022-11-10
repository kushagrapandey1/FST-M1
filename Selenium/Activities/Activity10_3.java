import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println("Title of the page: "+driver.getTitle());
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait for the ball to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		
		// Save the different elements in variables
		WebElement ball=driver.findElement(By.id("draggable"));
		WebElement drop1= driver.findElement(By.id("droppable"));
		WebElement drop2= driver.findElement(By.id("dropzone2"));
		
		// Compile a custom action for Drag/Drop and perform it.
		Actions dragAndDrop=new Actions(driver);
		dragAndDrop.dragAndDrop(ball, drop2).build().perform();
		
		//Verify that the ball has entered Dropzone 1.
		wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
		boolean ballPresent=driver.findElement(By.xpath("//div[text()='Dropzone 1']/following::p")).isDisplayed();
		System.out.println("ball is present in Dropzone 1?: "+ballPresent);
		
		
	}

}
