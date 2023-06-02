package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingHiddenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
		

		System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)")).isDisplayed());
		
		
		System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());
		

		
		
	}

}
