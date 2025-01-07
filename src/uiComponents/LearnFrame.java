package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://demo.automationtesting.in/Frames.html");
		/**
		 * 1. By id or name
		 * 2. By WebElement
		 * 3. By index
		 */
		driver.switchTo().frame("singleframe");
		//driver.switchTo().frame("SingleFrame");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='SingleFrame']")));
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@class='container']//input")).sendKeys("Greeshama");
		
		//brings out of frame
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.xpath("//h1")).getText();
		
		System.out.println(text);
		
		driver.quit();
		
		

	}

}
