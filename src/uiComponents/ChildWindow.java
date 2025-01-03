package uiComponents;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@class='example']/a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		Iterator<String> it = windowHandles.iterator();
		
		String parentWindow = it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		//will close current window
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();	

	}

}
