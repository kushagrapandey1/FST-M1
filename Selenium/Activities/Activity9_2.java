import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		//Chosen option
		WebElement chosen=driver.findElement(By.id("multi-value"));
		
		//Find multiList
		Select multiList=new Select(driver.findElement(By.id("multi-select")));
		
		
		//Select the 'JavaScript' option by visible text.
		multiList.selectByVisibleText("Javascript");
		System.out.println(chosen.getText());
		
		//Select the 'NodeJS' option by value.
		multiList.selectByValue("node");
		System.out.println(chosen.getText());
		
		//Select the 4th, 5th, and the 6th options by index.
		for(int i=4;i<=6;i++) {
			multiList.selectByIndex(i);
		}
		System.out.println(chosen.getText());
		
		//Deselect the 'NodeJS' option by value attribute.
		multiList.deselectByValue("node");
		System.out.println(chosen.getText());
		
		//Deselect the 7th option by index.
		multiList.deselectByIndex(7);
		System.out.println(chosen.getText());
		
		//Print all selected options one by one and deselect all options.
		//Get all elected option
		List<WebElement> selectedoptions=multiList.getAllSelectedOptions(); //to select all option use .getOption()
		//Print all selected options
        for(WebElement selectedoption:selectedoptions) {
        	
            System.out.println("Selected option: " + selectedoption.getText());

        }
        
        multiList.deselectAll();
        System.out.println(chosen.getText());
        
        driver.quit();
		
	}

}
