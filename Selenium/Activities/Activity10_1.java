import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page: "+driver.getTitle());
		
		//Find the cube
		WebElement cube=driver.findElement(By.id("wrapD3Cube"));
       
		//Left click
		actions.click(cube).build().perform();
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());
		
        //Double Click
        actions.doubleClick(cube).build().perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());
        
        //Right Click
        actions.contextClick(cube).build().perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal.getText());
        
	}

}
