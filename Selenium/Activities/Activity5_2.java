import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is: " + driver.getTitle());
		WebElement checkbox = driver.findElement(By.name("toggled"));
		System.out.println("Is checkbox selected - " + checkbox.isSelected());
		driver.findElement(By.name("toggled")).click();
		System.out.println("Is checkbox selected - " + checkbox.isDisplayed());
		driver.quit();
	}

}
