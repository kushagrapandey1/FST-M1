import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
public class Activity2 {
	public static void main(String[] args) {
	        //Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        //Open the browser
	        driver.get("https://www.training-support.net");
	        String title = driver.getTitle();
	        System.out.println("Title of the page is " +title);
	        WebElement idvalue = driver.findElement(By.id("about-link"));
	        System.out.println("Text in the element through ID: " + idvalue.getText());
	        WebElement classvalue = driver.findElement(By.className("inverted"));
	        System.out.println("Text in the element through Class: " + classvalue.getText());
	        WebElement linkvalue = driver.findElement(By.linkText("About Us"));
	        System.out.println("Text in the element through Link Text: " + linkvalue.getText());
	        WebElement cssvalue = driver.findElement(By.cssSelector(".green"));
	        System.out.println("Text in the element through CSS: " + cssvalue.getText());
	        driver.quit();
	    }
	

}
