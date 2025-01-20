package learnTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {

	/**
	 * 1. Anything annotated with @Test is considered as Test Case.
	 * 2. TestNG follows alphabetical order of execution.
	 * 3. lower priority test cases will execute first. execution order [0,1,2]
	 * 4. If any test case is not given priority it means it has 0 priority
	 * 5. If any two test cases have same priority , execution will be based on alphabetical order
	 * 6. BeforeTest will run once before all the test cases present in class
	 * 7. AfterTest will run once after all test cases are executed
	 * 8. BeforeMethod will execute before every test case
	 * 9. AfterMethod will execute after every test case
	 */
	
	@Test
	public void myFirstWebTest() {
		System.out.println("I am first web test");
	}
	
	@Test(priority=0)
	public void mySecondWebTest() {
		System.out.println("I am second web test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am in after test");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method");
	}
	
	
	
	
	
}
