package TestPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToUseAssertionsPt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");
		

		//Close cookie warning on Homepage  
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();

		// Click Test Store to navigate to Test Store		
		driver.findElement(By.linkText("TEST STORE")).click();
		
		// Click product that you want to inspect 
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		
		// Click Add to Cart for the item 
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
		
		
		//Slow down the test - to allow it to find the below amount
		Thread.sleep(2000);
		
		//Get total price within Cart
		String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();

		//JUnit Test Expected Result  , Actual Result
	    Assert.assertEquals("$26.12", total);
		
		//JUnit Test unexpected Result  , Actual Result
		//Assert.assertEquals("$26.42", total);
		




		
		
		
		
	

	}

}
