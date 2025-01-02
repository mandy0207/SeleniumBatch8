package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		
		driver.get("https://selenium.qabible.in/select-input.php");
		/**
		 * 1. Grab locator of dropdown
		 * 2. Attach dropdown locator to select class
		 * 3. Use any method of select class to select desired option
		 * 
		 */
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select staticDropdown = new Select(dropdown);
		staticDropdown.selectByVisibleText("Green");
		Thread.sleep(2000);
		
		staticDropdown.selectByValue("Yellow");
		Thread.sleep(2000);
		staticDropdown.selectByIndex(1);
		driver.quit();
		
		
	}

}
