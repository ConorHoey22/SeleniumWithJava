package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class HowToUseAssertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");
		
		String pageTitle = driver.getTitle();
		
		//JUnit Expected Result  , Actual Result
		Assert.assertEquals("Homepage", pageTitle);
		
		//incorrect Test
		//Assert.assertEquals("Homepage1", pageTitle);
	}

}
