package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		/**
		 * FindElements returns list of web elements
		 * FindElement returns first web  element 
		 */
		List<WebElement> addToCartBtns = driver.findElements(By.className("btn_inventory"));
		
		System.out.println(addToCartBtns.size());
		
		for(int i=0;i<addToCartBtns.size();i++) {
			addToCartBtns.get(i).click();
		}
		
//		for(WebElement addToCartBtn : addToCartBtns ) {
//			addToCartBtn.click();
//		}
		
		
		
		driver.quit();
		
		
	}
}
