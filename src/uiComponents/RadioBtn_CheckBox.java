package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn_CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement checkBox = driver.findElement(By.id("gridCheck"));
		
		boolean checkStatus=checkBox.isSelected();
		System.out.println("Is checkbox checked :"+checkStatus);
		System.out.println("Is checkbox enabled :"+checkBox.isEnabled());
		System.out.println("Is checkbox displayed :"+checkBox.isDisplayed());
		checkBox.click();
		

		System.out.println("Is checkbox checked :"+checkBox.isSelected());
		
		driver.quit();
		
	}

}
