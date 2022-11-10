import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+driver.getTitle());
		
		//Press the key of your first name in caps
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		actions.sendKeys("P").build().perform();
		System.out.println("Pressed Key is: " +pressedKey.getText());
		
		//Press CTRL+a and the CTRL+c to copy all the text on the page.
		actions.keyDown(Keys.CONTROL).
		sendKeys("a").
		sendKeys("c").
		keyUp(Keys.CONTROL).build().perform();
		
		System.out.println("Pressed Key is: " +pressedKey.getText());
		
		driver.quit();
	}

}
