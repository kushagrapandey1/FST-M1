import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is: " + driver.getTitle());
		WebElement inpbox = driver.findElement(By.xpath("//input[contains(@id, 'input-text')]"));
		System.out.println("Is Text box enabled - " + inpbox.isEnabled());
		driver.findElement(By.xpath("//button[contains(@id, 'toggleInput')]")).click();
		System.out.println("Is Text box enabled - " + inpbox.isEnabled());
		driver.quit();
	}

}
