package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://demowebshop.tricentis.com/");
		/**
		 * Syntaxes of Xpath
		 * 1. //tagname[@attribute='value'] or //*[@attribute='value']
		 * 2. //parent//child
		 * 3. (//parent)[index]/child     you can index parent or child
		 * 4. //tagname[text()='some value']
		 * 5. //tagname[contains(@attribute,'value')] 
		 */
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("mypassword");
		
		driver.findElement(By.xpath("//*[@class='buttons']//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//li[@class='inactive']/a)[4]")).click();
		
		driver.findElement(By.xpath("//a[text()='Blue Jeans']")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'EnteredQuantity')]")).clear();
		
		driver.findElement(By.xpath("//input[contains(@id,'EnteredQuantity')]")).sendKeys("4");

		driver.quit();
	}

}
