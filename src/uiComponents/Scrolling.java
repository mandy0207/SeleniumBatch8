package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 100);");
		
		Thread.sleep(2000);
		
		WebElement desiredElement = driver.findElement(By.xpath("//*[@class='totalAmount']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
		
		

	}

}
