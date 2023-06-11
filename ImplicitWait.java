package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT as there is a loading icon before the page loads the button on the page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.get("https://www.automationtesting.co.uk/loader.html");
		
		
		driver.findElement(By.cssSelector("button#loaderBtn")).click();

	}

}
