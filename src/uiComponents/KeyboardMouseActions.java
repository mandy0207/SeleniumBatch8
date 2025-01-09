package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement others = driver.findElement(By.id("others"));

		Actions act = new Actions(driver);
		// hover over an element
		act.moveToElement(others).perform();

		WebElement textBox = driver.findElement(By.id("single-input-field"));
		act.moveToElement(textBox).click().sendKeys("arya is a good girl").perform();
		textBox.clear();

		// performing keyboard action
		//keydown is pressing a button on keyboard
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("devika lives in kerela").perform();
		
		//double click
		WebElement btn = driver.findElement(By.id("button-one"));
		act.moveToElement(btn).doubleClick().perform();
		
		//right click
		act.moveToElement(btn).contextClick().perform();
		
		driver.quit();
		
		

	}

}
