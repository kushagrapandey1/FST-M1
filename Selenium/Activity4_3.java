import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		WebElement header3text = driver.findElement(By.xpath("//h3"));
		System.out.println("Header 3 Text: " + header3text.getText());
		WebElement header5CSS = driver.findElement(By.xpath("//h5"));
		System.out.println("Header 5 Colour: " + header5CSS.getCssValue("color"));
		WebElement violetclassattr = driver.findElement(By.xpath("//button[contains(@class, 'violet')]"));
		System.out.println("Violet Class values: " + violetclassattr.getAttribute("class"));
		WebElement greybuttext = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("Grey button text: " +greybuttext.getText() );
		driver.quit();

	}

}
