package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/accordion.html");
		
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
		
		for(int i = 0; i<10; i++)
		{
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		}

	}

}
